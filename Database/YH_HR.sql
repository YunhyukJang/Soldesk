--���� ����
create user soldesk identified by 12341234;
create user madang identified by 12341234;

--���� ���
alter user soldesk account lock;

--���� �ο�
grant connect, resource to soldesk;
grant connect, resource to madang;
grant create table, create view to soldesk;
grant create table, create view to madang;