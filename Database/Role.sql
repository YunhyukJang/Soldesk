--���� ����/����
--create/drop role

--system �������� ����
create role programmer;

--���ҿ� ���� �ο�
grant create any table, create view, create procedure to programmer;

--������ ���� ȸ��
revoke create table, create view, create procedure from programmer;

--������ �й�
grant programmer to yhguest;

--���ӵǾ� �ִ� ��� database���� ������ ���� �� �ֵ��� ����
set role all;

--������ ȸ��
revoke programmer from yhguest;

--yhguest �������� ����
create table soldesk.newtable(
myname varchar2(40), 
myphone varchar2(20)
);

insert into soldesk.newtable values('ȫ�浿', '000-0001-0002'); --Error

--system �������� ����
--���� �߰�
grant select, insert on soldesk.newtable to programmer;

--yhguest �������� ����
insert into soldesk.newtable values('ȫ�浿', '000-0001-0002');

Select * 
from soldesk.newtable;

--���� ȸ��
revoke select on soldesk.newtable from programmer;

--yhguest �������� ����
Select * 
from soldesk.newtable; --Error

--���� ����
drop role programmer;