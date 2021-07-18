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

--�Է�
insert into Book values(1, '�౸�� ����', '�½�����', 7000);
insert into Book values(2, '�౸�ƴ� ����', '������', 13000);
insert into Book values(3, '�౸�� ����', '���ѹ̵��', 22000);
insert into Book values(4, '���� ���̺�', '���ѹ̵��', 35000);
insert into Book values(5, '�ǰ� ����', '�½�����', 8000);
insert into Book values(6, '���� �ܰ躰 �н�', '�½�����', 6000);
insert into Book values(7, '�߱��� �߾�', '�̻�̵��', 20000);
insert into Book values(8, '�߱��� ��Ź��', '�̻�̵��', 13000);
insert into Book values(9, '�ø��� �̾߱�', '�Ｚ��', 7500);
insert into Book values(10, 'Olympic Champions', 'Pearson', 13000);

--�˻�
select * 
from book;

--Customer
drop table Customer;

create table Customer(
custid number(4) primary key, 
name varchar2(40), 
address varchar2(50), 
phone varchar2(20)
);

insert into Customer values(1, '������', '���� ��ü��Ÿ', '000-5000-0001');
insert into Customer values(2, '�迬��', '���ѹα� ����', '000-6000-0001');
insert into Customer values(3, '��̶�', '���ѹα� ������', '000-7000-0001');
insert into Customer values(4, '�߽ż�', '�̱� Ŭ������', '000-8000-0001');
insert into Customer values(5, '�ڼ���', '���ѹα� ����', null);

select * 
from Customer;

--Orders
drop table Orders;

create table Orders(
orderid number(4) primary key, 
custid number(4) references customer(custid), 
bookid number(4) references book(bookid), 
saleprice number(8), 
orderdate DATE
);

insert into Orders values(1, 1, 1, 6000, to_date('2021-07-01', 'yyyy-mm-dd'));
insert into Orders values(2, 1, 3, 21000, to_date('2021-07-03', 'yyyy-mm-dd'));
insert into Orders values(3, 2, 5, 8000, to_date('2021-07-03', 'yyyy-mm-dd'));
insert into Orders values(4, 3, 6, 6000, to_date('2021-07-04', 'yyyy-mm-dd'));
insert into Orders values(5, 4, 7, 20000, to_date('2021-07-05', 'yyyy-mm-dd'));
insert into Orders values(6, 1, 2, 12000, to_date('2021-07-07', 'yyyy-mm-dd'));
insert into Orders values(7, 4, 8, 13000, to_date('2021-07-07', 'yyyy-mm-dd'));
insert into Orders values(8, 3, 10, 12000, to_date('2021-07-08', 'yyyy-mm-dd'));
insert into Orders values(9, 2, 10, 7000, to_date('2021-07-09', 'yyyy-mm-dd'));
insert into Orders values(10, 3, 8, 13000, to_date('2021-07-10', 'yyyy-mm-dd'));

select * 
from orders;