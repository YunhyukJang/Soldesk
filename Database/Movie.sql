/*
����(�����ȣ, �����̸�, ��ġ)
�󿵰�(�����ȣ, �󿵰���ȣ, ��ȭ����, ����, �¼���)
����(�����ȣ, �󿵰���ȣ, ����ȣ, �¼���ȣ, ��¥)
��(����ȣ, �̸�, �ּ�)

primary key
����:�����ȣ
�󿵰�:�󿵰���ȣ
����:�¼���ȣ
��:����ȣ

foreign key
�󿵰�:����(�����ȣ)
����:����(�����ȣ), �󿵰�(�󿵰���ȣ), ��(����ȣ)
*/

--���� table ����
drop table ����;

create table ����(
�����ȣ number(10), 
�����̸� varchar2(40), 
��ġ varchar2(40)
);

alter table ���� add primary key(�����ȣ);

select * 
from ����;

--�󿵰� table ����
drop table �󿵰�;

create table �󿵰�(
�����ȣ number(10), 
�󿵰���ȣ number(10), 
��ȭ���� varchar(40), 
���� number(10), 
�¼��� number(10)
);

alter table �󿵰� add primary key(�󿵰���ȣ);
alter table �󿵰� add constraint �󿵰�_����_fk foreign key(�����ȣ) references ����(�����ȣ);

select * 
from �󿵰�;

--���� table ����
drop table ����;

create table ����(
�����ȣ number(10), 
�󿵰���ȣ number(10), 
����ȣ number(10), 
�¼���ȣ number(10), 
��¥ date
);

alter table ���� add primary key(�¼���ȣ);
alter table ���� add constraint ����_����_fk foreign key(�����ȣ) references ����(�����ȣ);
alter table ���� add constraint ����_�󿵰�_fk foreign key(�󿵰���ȣ) references �󿵰�(�󿵰���ȣ);
alter table ���� add constraint ����_��_fk foreign key(����ȣ) references ��(����ȣ);

select * 
from ����;

--�� table ����
drop table ��;

create table ��(
����ȣ number(10), 
�̸� varchar2(40), 
�ּ� varchar2(40)
);

alter table �� add primary key(����ȣ);

select * 
from ��;