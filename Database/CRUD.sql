--C(Create)
--R(Read)
--U(Update)
--D(Delete)

--insert into
insert into book values(11, '������ ����', '�ֵ���ũ ����', 9000);
insert into book(bookid, bookname, publisher) 
values(14, '������ ����', '�ֵ���ũ ����');

Select * from book;

drop table imported_book;

create table imported_book(
bookid number(10), 
bookname varchar2(20), 
publisher varchar2(20), 
price number(10)
);

Select * 
from imported_book;

insert into imported_book values(12, '������ �̷�', '���ѹ̵��', 12000);
insert into imported_book values(13, '�䰡�� ����', '�ֵ���ũ', 24000);
insert into imported_book values(15, '���̾߱�', '���ѹ̵��', 15000);
insert into imported_book values(16, '�ڷγ�19', '�̻�̵��', 27000);
insert into imported_book values(17, '�ڷγ��غ�', '�ֵ���ũ', 24000);

--bulk insert/dump insert
insert into book(bookid, bookname, publisher, price)
Select bookid, bookname, publisher, price 
from imported_book;

--update set
Select * 
from customer;

update customer 
set address='���ѹα� �λ�' 
where custid=5;

--��ø ���Ǹ� Ȱ���� update
--�迬���� �ּҿ� �ڼ����� �ּҸ� ���� ������ ������Ʈ
update customer 
set address=(select address 
from customer 
where name like '�迬��') 
where name like '�ڼ���';

--delete from
delete from imported_book 
where bookid=12;

--book���� �Ｚ�� ���ǻ� ����
delete from book 
where publisher like '�Ｚ��';

--���ѹ̵� �������ǻ�� ����
update book 
set publisher='�������ǻ�' 
where publisher='���ѹ̵��';