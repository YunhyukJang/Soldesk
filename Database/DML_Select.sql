select * 
from book;

select * 
from customer;

select * 
from orders;

--DML(Data Manipulation Language)
--insert into
--delete from
--update set
--select from
select phone 
from customer;

select *
from customer 
where name='�迬��';

select name, phone 
from customer
where name='�迬��';

--��� ������ �̸��� ���� ������ �˻�
select bookname, price
from book;

--��� ������ ���ݰ� �̸��� �˻�
select price, bookname 
from book;

--���� ���̺��� ���ǻ� �˻�
select publisher 
from book;

--���ǻ翡�� �ߺ����� �����ϰ� ���
select distinct publisher 
from book;

--������ 20000���� ������ ��� ���� �˻�
select * 
from book 
where price<=20000;

--������ 10000�̻�, 20000���� ������ �˻�
select * 
from book 
where price >= 10000 and price <= 20000;

select * 
from book 
where price between 10000 and 20000;

--�౸�� ���縦 �Ⱓ�� ���ǻ� �˻�(������� ���ǻ� ���)
select bookname, publisher 
from book 
where bookname like '�౸�� ����';

select bookname, publisher 
from book 
where bookname='�౸�� ����';

--������ '�౸'�� ���Ե� ������ �Ⱓ�� ���ǻ� �˻�
select * 
from book
where bookname like '%�౸%';

--�������� ���� �� ��° ��ġ�� ���ڰ� '��'�� ���ڿ��� ���� ���� �˻�
select * 
from book 
where bookname like '_��%';

--�౸�� ���� ���� �� ������ 20000�� �̻��� ������ �˻�
select * 
from book 
where bookname like '%�౸%' and price>=20000;

--���ǻ簡 '�½�����' �Ǵ� '���ѹ̵��'�� ������ �˻�
select * 
from book 
where publisher like '�½�����' or publisher like '���ѹ̵��';

--������ �̸������� �˻�
select * 
from book 
order by bookname;

--������ ���ݼ����� �˻��ϰ� ������ ������ �̸������� ���� ����
select * 
from book 
order by price, bookname;

--������ ������ ������������ �˻��ϰ� ���� ������ ������ ���ǻ縦 ������������ �˻�
select * 
from book 
order by price desc, publisher asc;

--������ȣ�� 1�� ������ �̸�
select bookname 
from book 
where bookid like 1;

--�������� ������ ������ �̸�, ����, ������ �Ǹ� ���� ���̸� �˻�
select bookname, price, price-saleprice 
from book, orders, customer 
where customer.custid=orders.custid and orders.bookid=book.bookid 
and customer.name like '������';

--2021�� 7�� 4��~2021�� 7�� 7�� ���̿� �ֹ��� ������ �ֹ���ȣ�� �˻�
select orderid 
from orders 
where orderdate between '21/07/04' and '21/07/07';

--2021�� 7�� 4��~2021�� 7�� 7�� ���̿� �ֹ��� ������ ������ �ֹ���ȣ�� �˻�
select orderid 
from orders 
where orderdate not between '21/07/04' and '21/07/07';

--���� '��'���� ���� �̸��� �ּҸ� �˻�
select name, address 
from customer 
where name like '��%';

--���� '��'���� �̸��� '��'�� ������ ���� �̸��� �ּҸ� �˻�
select name, address 
from customer 
where name like '��%��';

--���� �̸��� ���� ������ ���� ����� �˻�
select name, bookname 
from book bk, customer ct, orders od 
where bk.bookid=od.bookid
and ct.custid=od.custid 
order by name;