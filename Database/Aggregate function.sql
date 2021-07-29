select * 
from book;

select * 
from customer;

select * 
from orders;

--���� �ֹ��� ������ �� �ݾ�
select sum(saleprice) as "�� ����" 
from orders;

--2�� �迬�� ���� �ֹ��� ������ �� �ݾ�
select sum(saleprice) as "�� ����" 
from orders 
where custid=2;

--���� �ֹ��� ������ �� �Ǹ� �ݾ�, ��հ�, ������, �ְ�
select sum(saleprice) as Total, 
avg(saleprice) as Average, 
min(saleprice) as Minimum, 
max(saleprice) as Maximum
from orders;

--���� �Ǹ� ��
select count(*) 
from orders;

--���� �Ǹ� ������ 20000�̻��� �Ǹ� �Ǽ�
select count(case when saleprice >= 20000 then 1 end) as VIP 
from orders;

--���� �Ǹ� ������ 20000�̻��� �Ǹ� �Ǽ��� 10000������ �Ǹ� �Ǽ�
select count(case when saleprice >= 20000 then 1 end) as VIP, 
count(case when saleprice <= 10000 then 1 end) as CS 
from orders;

--���� �ֹ��� ������ �� ������ �� �ݾ�
select count(*) as "���� ����", sum(saleprice) as "�� �ݾ�" 
from orders 
group by custid;

--������ 8000�̻��� ������ ���� ���� �� ����(�� �� �� �̻� ������ ��)
select custid, count(*) as "�� ����" 
from orders 
where saleprice >= 8000 
group by custid 
having count(*) >= 2;

--���� �̸��� ���� �ֹ��� ������ �Ǹ� ����
select name, sum(saleprice) 
from customer ct, orders od 
where ct.custid=od.custid
group by ct.name;

--Oracle join
--���� �̸��� �ֹ��� ������ �̸�
select name, bookname 
from customer ct, book bk, orders od 
where ct.custid=od.custid and bk.bookid=od.bookid;

--�Ϲ����� join
select name, bookname 
from orders od 
inner join book bk on od.bookid=bk.bookid 
inner join customer ct on od.custid=ct.custid;

--Oracle join
--������ 20000�̻��� ������ ������ ���� �̸��� �ֹ��� ������ �̸�
select name, bookname 
from customer ct, book bk, orders od 
where ct.custid=od.custid and bk.bookid=od.bookid 
and bk.price >= 20000;

--�Ϲ����� join
select name, bookname 
from orders od 
inner join book bk on od.bookid=bk.bookid 
inner join customer ct on od.custid=ct.custid 
where bk.price >= 20000;

--�������� ������ ������ �� �ݾ�
select sum(saleprice) 
from customer ct, orders od 
where ct.custid=od.custid 
and ct.name like '������';

--inner join
select sum(saleprice) 
from orders od 
inner join customer ct on od.custid=ct.custid 
where ct.name like '������';

--�������� ������ ������ ��
select count(*) 
from customer ct, orders od 
where ct.custid=od.custid 
and ct.name like '������';

--�������� ������ ������ ���ǻ� ��
select count(distinct publisher) 
from book bk, customer ct, orders od 
where bk.bookid=od.bookid and ct.custid=od.custid 
and ct.name like '������';

--���� ������ �� ���� ����
select count(*) 
from book;

--���� ������ �ŷ��ϰ� �ִ� ���ǻ��� ��
select count(distinct publisher) 
from book;

--������ �������� ���� ���� �����Ͽ� ���� �̸��� �ֹ��� ������ �Ǹ� ������ �˻�
--outer join
select name, saleprice 
from customer ct left outer join orders od 
on od.custid=ct.custid;

--right outer join=inner join
select name, saleprice 
from customer ct right outer join orders od 
on od.custid=ct.custid;