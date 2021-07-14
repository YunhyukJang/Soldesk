--department ���̺� ����
drop table department;

create table department(
id number(10) not null primary key, 
depart_num varchar2(20), 
depart_tel varchar2(20)
);

--data �Է�
insert into department values(1, '��ۿ�����', '02-0000-0000');
insert into department values(2, '��ۿ�����', '02-1111-1111');
insert into department values(5, null, null);
insert into department values(3, '��ȹ��', '02-2222-2222');
insert into department values(4, '���������', '02-3333-3333');

select *
from department;

--userInfo ���̺� ����
--id�� �⺻ Ű�鼭 ���� ��� �� ��
drop table userInfo;

create table userInfo(
id number(10) not null primary key, 
name varchar2(20), 
loginId varchar2(20), 
email varchar2(20), 
foreign key(id) references department(id)
);

insert into userInfo values(1, '��ä��', '272', '272@naver.com');
insert into userInfo values(2, '����', 'kim', 'kim@gmail.com');
insert into userInfo values(3, '������', 'song', 'song@daum.net');
insert into userInfo values(5, '������', 'jeon', 'jeon@gmail.com');

select *
from userInfo;

--inner join(natural join)
--��� 1. oracle
select userInfo.id, userInfo.name, userInfo.email, 
department.depart_num, department.depart_tel
from userInfo, department
where userInfo.id=department.id;

--��� 2. 
select userInfo.id, userInfo.name, userInfo.email, 
department.depart_num, department.depart_tel
from userInfo
inner join department
on userInfo.id=department.id;

--��� 3. 
select userInfo.id, userInfo.name, userInfo.email, 
department.depart_num, department.depart_tel
from userInfo, department
where userInfo.id (+)= department.id;