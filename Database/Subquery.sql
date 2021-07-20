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
--

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
--

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