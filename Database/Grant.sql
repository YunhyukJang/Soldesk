create user yhguest identified by yhguest;

grant connect, resource to yhguest;

--��й�ȣ �н� ��
alter user yhguest identified by yhguest;

--madang �������� ����
--yhguest���� madang database book table�� select ������ �ο�
grant select on book to yhguest;

--yhguest���� madang database customer table�� select, update ������ �ο�
--�� with grant option�� �Բ� �ο� *�ο����� ������ �絵�� �� ����
grant select, update on customer to yhguest with grant option;

--yhguest �������� ����
grant select on madang.book to hotel; --Error

grant select on madang.customer to hotel;

--hotel �������� ����
Select * 
from madang.book; --Error

Select * 
from madang.customer;

--madang �������� ����
--orders table�� ��� database(�����)�� select�� �� �ֵ��� ������ �ο�
grant select on orders to public;

--���� ȸ��(revoke)
--yhguest���� �ο��Ǿ��� book table�� select ���� ȸ��
revoke select on book from yhguest;

--yhguest���� �ο��Ǿ��� customer table�� select ���� ȸ��
revoke select on customer from yhguest;

--with grant option ���ѱ��� ȸ��
revoke select on customer from yhguest cascade constraints;
revoke update on customer from yhguest cascade constraints;

--yhguest �������� ����
Select * 
from madang.book; --Error

Select * 
from madang.customer; --Error

grant select on madang.customer to hr; --Error
grant update on madang.customer to hr; --Error