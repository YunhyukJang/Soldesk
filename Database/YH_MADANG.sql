--name:demon_madang.sql
--���� ���� database

--���� ����
--create user madang identified by 12341234;
--���� �ο�
--grant connect, resource to madang;
--grant create table, create view to madang;
--�����ͺ��̽� ��� ����
--alter user madang account unlock;

--Book
--���̺� ����
drop table Book;

--���̺� ����
create table Book(
bookid number(4) primary key, 
bookname varchar2(40), 
publisher varchar2(40), 
price number(8)
);

--�˻�
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