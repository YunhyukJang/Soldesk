--�μ�����(��Į��, �ζ���, ��ø)

--��ø����
--������ ���� ��� ������ �̸�
select bookname 
from book 
where price=(select max(price) from book);

--������ ������ ���� �ִ� ���� �̸�
select name 
from customer 
where custid in (select custid from orders);

--���ѹ̵��� ������ ������ ������ ���� �̸�
select name 
from customer 
where custid in (select custid from orders where bookid in (
select bookid from book where publisher like '���ѹ̵��'));

--���� ����(����μ�����)
--���ǻ纰�� ���ǻ��� ��� ���� ���ݺ��� ��� ������ �˻�
select bk1.publisher, bk1.bookname 
from book bk1
where bk1.price > (select avg(bk2.price) from book bk2 where bk1.publisher=bk2.publisher);

--���� ����
select name 
from customer 
minus (select name from customer where custid in (select custid from orders));

--Exists
--�ֹ��� �ִ� ���� �̸��� �ּ�
select name, address 
from customer ct 
where exists(select * from orders od where od.custid=ct.custid);