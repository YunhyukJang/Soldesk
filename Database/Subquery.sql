--부속질의(스칼라, 인라인, 중첩)

--중첩질의
--가격이 가장 비싼 도서의 이름
select bookname 
from book 
where price=(select max(price) from book);

--도서를 구매한 적이 있는 고객의 이름
select name 
from customer 
where custid in (select custid from orders);

--대한미디어에서 출판한 도서를 구매한 고객의 이름
select name 
from customer 
where custid in (select custid from orders where bookid in (
select bookid from book where publisher like '대한미디어'));

--관계 연산(상관부속질의)
--출판사별로 출판사의 평균 도서 가격보다 비싼 도서를 검색
select bk1.publisher, bk1.bookname 
from book bk1
where bk1.price > (select avg(bk2.price) from book bk2 where bk1.publisher=bk2.publisher);

--집합 연산
select name 
from customer 
minus (select name from customer where custid in (select custid from orders));

--Exists
--주문이 있는 고객의 이름과 주소
select name, address 
from customer ct 
where exists(select * from orders od where od.custid=ct.custid);

--주문이 없는 고객의 이름과 주소
select name, address 
from customer ct 
where not exists(select * from orders od where od.custid=ct.custid);

--Exists 처리 순서:Mainquery -> Subquery *속도가 빠름
--not Exists:null에 대해 true
--in 처리 순서:Subquery -> Mainquery *속도가 느림
--not in:null에 대해 false

--박지성이 구매하지 않은 도서의 이름(not exists)
Select bookname 
from book bk 
where not exists (select bookname from customer ct, orders od 
where ct.custid=od.custid and od.bookid=bk.bookid 
and ct.name like '박지성');

--도서의 가격과 판매가격의 차이가 가장 큰 주문의 정보
Select * 
from book bk, orders od 
where bk.bookid=od.bookid 
and price-saleprice=(select max(price-saleprice) 
from book, orders 
where book.bookid=orders.bookid);

--고객별 평균을 구해서 고객의 이름과 평균을 보여라
Select name, round(avg(saleprice), 2) 
from orders od, customer ct 
where od.custid=ct.custid 
group by ct.name;

Select name, avg(saleprice) 
from orders od, customer ct 
where od.custid=ct.custid 
group by name 
having avg(saleprice) > (select avg(saleprice) from orders);

--박지성이 구매한 도서의 출판사와 같은 출판사에서 도서를 구매한 고객의 이름
Select name 
from orders od, book bk, customer ct 
where od.bookid=bk.bookid and od.custid=ct.custid 
and name not like '박지성' 
and bk.publisher in (select distinct publisher 
from orders od, customer ct, book bk  
where od.custid=ct.custid and od.bookid=bk.bookid 
and ct.name like '박지성');

--2개 이상의 서로 다른 출판사에서 도서를 구매한 고객의 이름
Select name 
from customer ct 
where 2 <= (select count(distinct b.publisher) 
from book b, orders o, customer c 
where b.bookid=o.bookid and c.custid=o.custid 
and name like ct.name);

--전체 고객의 30% 이상이 구매한 도서의 아이디
Select bookname 
from book bk 
where (select count(book.bookid) 
from book, orders
where orders.bookid=book.bookid and bk.bookid=book.bookid)
>= 0.3*(select count(*) from customer);

Select bk.bookname 
from book bk, orders od, customer ct 
where bk.bookid=od.bookid and ct.custid=od.custid 
group by bk.bookname 
having count(od.bookid) > 0.3*(select count(*) from customer);

--일반 질의
Select name, sum(saleprice) as "Total"
from customer ct, orders od
where ct.custid=od.custid 
group by name;

--스칼라 질의
Select (select name from customer ct where ct.custid=od.custid) as "Name", 
sum(saleprice) "Total" 
from orders od 
group by od.custid;

--인라인 질의
Select ct.name, sum(saleprice) as "Total" 
from (select custid, name from customer where custid <= 2) ct, orders od
where ct.custid=od.custid 
group by ct.name;

--평균 주문금액 이하의 주문에 대한 주문번호와 saleprice 금액
Select orderid, saleprice 
from orders 
where saleprice <= (select avg(saleprice)
from orders);

--대한민국에 거주하는 고객에게 판매한 도서의 총 판매금액
Select sum(saleprice) as "Total" 
from orders 
where custid in (select custid 
from customer 
where address like '%대한민국%');

--3번 고객이 주문한 책의 판매 가격보다 더 비싼 도서를 구입한 고객의 정보
Select orderid, custid, saleprice 
from orders 
where saleprice>all(Select saleprice 
from orders 
where custid=3);

--3번 고객이 주문한 책 중 최저 판매 가격보다 더 비싼 도서를 구입한 고객의 정보
Select orderid, custid, saleprice 
from orders 
where saleprice>some(Select saleprice 
from orders 
where custid=3);

--어떤 질의에 대한 것인지 설명하라
--스칼라 질의
--도서를 구매한 고객의 고객아이디별 고객 아이디, 주소, 총 구매 금액
Select custid, (select address 
from customer ct 
where ct.custid=od.custid) address, 
sum(saleprice) total 
from orders od 
group by od.custid;

--인라인 질의
Select ct.name, s 
from (select custid, avg(saleprice) s 
from orders 
group by custid) od, customer ct 
where ct.custid=od.custid;

--중첩 질의
--도서를 구매한 고객의 고객번호가 3이하인 고객의 총 구매 금액
Select sum(saleprice) total 
from orders od 
where exists (select * 
from customer ct 
where custid <= 3 and ct.custid=od.custid);