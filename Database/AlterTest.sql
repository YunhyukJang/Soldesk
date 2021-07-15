/*
-DDL(Data Definition Language)

-Table ����
create table ���̺��

--Table ����
drop table ���̺��

--Table ����
alter table ���̺��(���� �Ǵ� �߰��Ǵ� �Ӽ�)
*/

--NewBook ���̺� ����
drop table NewBook;

create table NewBook(
bookid number, 
bookname varchar2(20), 
publisher varchar2(20), 
price number
);

--unique=�ߺ� �ȵ�
--default 10000=���� ������ 10000
--check(price>1000)=������ �ּ� 1000�̻�
create table NewBook(
bookid number not null, 
bookname varchar2(20), 
publisher varchar2(20) unique, 
price number default 10000 check(price>1000), 
primary key(bookid)
);

select * 
from NewBook;

--NewCustomer ���̺� ����
drop table NewCustomer;

create table NewCustomer(
custid number primary key, 
name varchar2(40), 
address varchar2(40), 
phone varchar2(30)
);

select * 
from NewCustomer;

--on delete cascade=���� ���� ��� ����
--NewOrders ���̺� ����
drop table NewOrders;

create table NewOrders(
orderid number, 
custid number not null, 
bookid number not null, 
saleprice number, 
orderdate date, 
primary key(orderid), 
foreign key(custid) references NewCustomer(custid) 
on delete cascade
);

select * 
from NewOrders;

--���̺� �̸� ����(Newbook -> TB_newbook)
alter table Newbook rename to TB_newbook;

--TB_newbook�� �Ӽ� �߰�(isbn varchar2(20))
alter table TB_newbook add isbn varchar2(20);

--���̺� �Ӽ� �˻�
desc TB_newbook;

--number(2, 2) -> int, float
--TB_newbook�� isbn Ÿ���� number�� ����
alter table TB_newbook modify isbn number;

--�Ӽ��� �̸� ����
alter table TB_newbook rename column isbn to iss;

--iss �Ӽ� ����
alter table TB_newbook drop column iss;

--TB_newbook primary key ����
alter table TB_newbook drop primary key;

--TB_newbook primary key ����
alter table TB_newbook add primary key(bookid);

--not null ���� ���� ����
alter table TB_newbook modify bookname varchar2(20) not null;

--NewOrders�� TB_newbook�� bookid�� foreign key�� ����
alter table NewOrders add constraint test_FK foreign key(bookid) 
references TB_newbook(bookid);

--NewOrders foreign key ����
alter table NewOrders drop constraint test_FK;