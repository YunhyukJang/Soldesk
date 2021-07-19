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