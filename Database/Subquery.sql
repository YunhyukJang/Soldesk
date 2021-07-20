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

--�ֹ��� ���� ���� �̸��� �ּ�
select name, address 
from customer ct 
where not exists(select * from orders od where od.custid=ct.custid);

--Exists ó�� ����:Mainquery -> Subquery *�ӵ��� ����
--not Exists:null�� ���� true
--in ó�� ����:Subquery -> Mainquery *�ӵ��� ����
--not in:null�� ���� false

--�������� �������� ���� ������ �̸�(not exists)
Select bookname 
from book bk 
where not exists (select bookname from customer ct, orders od 
where ct.custid=od.custid and od.bookid=bk.bookid 
and ct.name like '������');

--������ ���ݰ� �ǸŰ����� ���̰� ���� ū �ֹ��� ����
--

--���� ����� ���ؼ� ���� �̸��� ����� ������
Select name, round(avg(saleprice), 2) 
from orders od, customer ct 
where od.custid=ct.custid 
group by ct.name;

Select name, avg(saleprice) 
from orders od, customer ct 
where od.custid=ct.custid 
group by name 
having avg(saleprice) > (select avg(saleprice) from orders);

--�������� ������ ������ ���ǻ�� ���� ���ǻ翡�� ������ ������ ���� �̸�
Select name 
from orders od, book bk, customer ct 
where od.bookid=bk.bookid and od.custid=ct.custid 
and name not like '������' 
and bk.publisher in (select distinct publisher 
from orders od, customer ct, book bk  
where od.custid=ct.custid and od.bookid=bk.bookid 
and ct.name like '������');

--2�� �̻��� ���� �ٸ� ���ǻ翡�� ������ ������ ���� �̸�
--

--��ü ���� 30% �̻��� ������ ������ ���̵�
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

--�Ϲ� ����
Select name, sum(saleprice) as "Total"
from customer ct, orders od
where ct.custid=od.custid 
group by name;

--��Į�� ����
Select (select name from customer ct where ct.custid=od.custid) as "Name", 
sum(saleprice) "Total" 
from orders od 
group by od.custid;

--�ζ��� ����
Select ct.name, sum(saleprice) as "Total" 
from (select custid, name from customer where custid <= 2) ct, orders od
where ct.custid=od.custid 
group by ct.name;

--��� �ֹ��ݾ� ������ �ֹ��� ���� �ֹ���ȣ�� saleprice �ݾ�
Select orderid, saleprice 
from orders 
where saleprice <= (select avg(saleprice)
from orders);

--���ѹα��� �����ϴ� ������ �Ǹ��� ������ �� �Ǹűݾ�
Select sum(saleprice) as "Total" 
from orders 
where custid in (select custid 
from customer 
where address like '%���ѹα�%');