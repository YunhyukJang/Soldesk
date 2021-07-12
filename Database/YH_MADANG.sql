--name:demon_madang.sql
--서점 관리 database

--계정 생성
--create user madang identified by 12341234;
--권한 부여
--grant connect, resource to madang;
--grant create table, create view to madang;
--데이터베이스 잠금 해제
--alter user madang account unlock;

--Book
--테이블 삭제
drop table Book;

--테이블 생성
create table Book(
bookid number(4) primary key, 
bookname varchar2(40), 
publisher varchar2(40), 
price number(8)
);

--검색
select * from book;

--Customer
drop table Customer;

create table Customer(
custid number(4) primary key, 
name varchar2(40), 
address varchar2(50), 
phone varchar2(20)
);

select * from Customer;

--Orders
drop table Orders;

create table Orders(
orderid number(4) primary key, 
custid number(4) references customer(custid), 
bookid number(4) references book(bookid), 
saleprice number(8), 
orderdate DATE
);

select * from orders;