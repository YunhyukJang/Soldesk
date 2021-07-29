/*
View�� ����
-����:����ڰ� �ʿ�� �ϴ� ������ �˻��Ͽ� �Ϲ� ���̺�ó�� ��� ����
-���뼺:���� ���̺��� �����Ͽ� ������ ���̺�� ����
-���ȼ�:�߿��� ���Ǹ� ���� �ִ� �並 ������ ��ȣȭ�Ͽ� ���� ��ȣ

View�� ����
-���� �� ������ Ʃ�÷κ��� ����ϴ� �ð��� ���� �ɸ�
-insert, delete, update�� ������ �ִ�.
-alter ��� �Ұ���
*/
Select * 
from book;

Select * 
from book 
where bookname like '%�౸%';

create view vw_book 
as select * 
from book 
where bookname like '%�౸%';

Select * 
from vw_book;

--�ּҿ� ���ѹα��� �� ���� ���� ��(vw_customer)
create view vw_customer 
as select * 
from customer 
where address like '%���ѹα�%';

Select * 
from vw_customer;

--orders ���̺��� �����̸�, ���̸��� �ٷ� Ȯ���� �� �ִ� ��(vw_orders)
--orderid, custid, name, bookid, bookname, saleprice, orderdate
create view vw_orders 
as select od.orderid, ct.custid, ct.name, bk.bookid, bk.bookname, od.saleprice, od.orderdate 
from orders od, book bk, customer ct 
where od.custid=ct.custid and od.bookid=bk.bookid;

Select * 
from vw_orders;

Select orderid, bookname, saleprice 
from vw_orders 
where name like '�迬��';

create or replace view vw_customer(custid, name, address) 
as select custid, name, address 
from customer 
where address like '%����%';

--vw_book�� ���ǻ翡 '�ֵ���ũ'��� ���ڰ� �� ������ �籸���ϰ�  price�� �����Ѵ�.
--(bookid, bookname, publisher)
create or replace view vw_book(bookid, bookname, publisher) 
as select bookid, bookname, publisher 
from book 
where publisher like '%�ֵ���ũ%';

--View ����
drop view vw_customer;

--�ǸŰ����� 20000 �̻��� ������ȣ, �����̸�, ���̸�, ���ǻ�, �ǸŰ����� �����ִ� highorders
create view highorders 
as select bk.bookid, bk.bookname, ct.name, bk.publisher, od.saleprice 
from book bk, customer ct, orders od 
where bk.bookid=od.bookid and ct.custid=od.custid 
and saleprice >= 20000;

Select * 
from highorders;