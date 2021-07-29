--�����Լ�
Select ABS(-78), ABS(+78) 
from dual;

Select round(4.785, 2) 
from dual;

Select custid "����ȣ", round(sum(saleprice)/count(*), -2) "��ձݾ�" 
from orders 
group by custid;

--�����Լ�
Select bookid, replace(bookname, '�߱�', '��') bookname, price 
from book;

Select bookid, replace(replace(bookname, '�౸', '�߾߱�'), 
'�ǰ�', '��Ű') bookname, price 
from book;

Select bookid, replace(replace(replace(bookname, '��', '�߱�'), 
'�߾߱�', '�౸'), '��Ű', '�ǰ�') bookname, price 
from book;

Select bookname "����", length(bookname) "���ڼ�", lengthb(bookname) "����Ʈ��" 
from book 
where publisher='�½�����';

Select substr(name, 1, 1) "��", count(*) "�ο�" 
from customer 
group by substr(name, 1, 1);

--������ �����͸� ��¥������ ��ȯ:to_date
--��¥�� �����͸� ���������� ��ȯ:to_char

--������ �ֹ��Ϸκ��� 3�� �� ���� Ȯ���� �Ѵ�. �� �ֹ��� Ȯ�� ��¥�� ���
Select orderid "�ֹ���ȣ", orderdate "�ֹ���", orderdate+3 "Ȯ����¥" 
from orders;

--2021�� 7�� 7�Ͽ� �ֹ����� ������ �ֹ���ȣ, �ֹ���, ����ȣ, ������ȣ�� ���
--�� ��¥�� yyyy-mm-dd ������ ���ڷ� �Ѵ�.
Select orderid �ֹ���ȣ, to_char(orderdate, 'yyyy-mm-dd') �ֹ���, 
custid ����ȣ, bookid ������ȣ 
from orders 
where orderdate=to_date('20210707', 'yyyy-mm-dd');

Select add_months(to_date('20210722', 'yyyy-mm-dd'), 3) 
from dual;

Select last_day(to_date('20211007', 'yyyy-mm-dd')) 
from dual;

Select systimestamp 
from dual;

Select sysdate, to_char(sysdate, 'yyyy-mm-dd dy hh24:mi:ss') "sysdate_1" 
from dual;

--null ó��
Select name �̸�, nvl(phone, '����ó����') ��ȭ��ȣ 
from customer;

--rownum
Select rownum ����, custid, name, phone 
from customer 
where rownum <= 3;