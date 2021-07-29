/*
View의 장점
-편리성:사용자가 필요로 하는 정보를 검색하여 일반 테이블처럼 사용 가능
-재사용성:원본 테이블을 재사용하여 나만의 테이블로 재사용
-보안성:중요한 질의를 갖고 있는 뷰를 별도로 암호화하여 정보 보호

View의 단점
-실행 시 각각의 튜플로부터 계산하는 시간이 오래 걸림
-insert, delete, update에 제한이 있다.
-alter 사용 불가능
*/
Select * 
from book;

Select * 
from book 
where bookname like '%축구%';

create view vw_book 
as select * 
from book 
where bookname like '%축구%';

Select * 
from vw_book;

--주소에 대한민국이 들어간 고객에 대한 뷰(vw_customer)
create view vw_customer 
as select * 
from customer 
where address like '%대한민국%';

Select * 
from vw_customer;

--orders 테이블의 도서이름, 고객이름을 바로 확인할 수 있는 뷰(vw_orders)
--orderid, custid, name, bookid, bookname, saleprice, orderdate
create view vw_orders 
as select od.orderid, ct.custid, ct.name, bk.bookid, bk.bookname, od.saleprice, od.orderdate 
from orders od, book bk, customer ct 
where od.custid=ct.custid and od.bookid=bk.bookid;

Select * 
from vw_orders;

Select orderid, bookname, saleprice 
from vw_orders 
where name like '김연아';

create or replace view vw_customer(custid, name, address) 
as select custid, name, address 
from customer 
where address like '%영국%';

--vw_book을 출판사에 '솔데스크'라는 글자가 들어간 것으로 재구성하고  price는 제외한다.
--(bookid, bookname, publisher)
create or replace view vw_book(bookid, bookname, publisher) 
as select bookid, bookname, publisher 
from book 
where publisher like '%솔데스크%';

--View 삭제
drop view vw_customer;

--판매가격이 20000 이상인 도서번호, 도서이름, 고객이름, 출판사, 판매가격을 보여주는 highorders
create view highorders 
as select bk.bookid, bk.bookname, ct.name, bk.publisher, od.saleprice 
from book bk, customer ct, orders od 
where bk.bookid=od.bookid and ct.custid=od.custid 
and saleprice >= 20000;

Select * 
from highorders;