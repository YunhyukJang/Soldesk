--���� ����
create user Employee identified by 12341234;

grant connect, resource to Employee;

alter user Employee account unlock;

/*
[��� ������Ʈ �����ͺ��̽�] ���� �����̼��� ���� ������ ���Ͻÿ�.
Employee�� ���, Department�� �μ�, Project�� ������Ʈ ����, Works�� ����� 
������Ʈ�� ������ ������ ��Ÿ����. �� ����� ���� ������Ʈ���� ���� �� �ְ�, �� 
������Ʈ���� ���� ����� ���� �� �ִ�. hours-worked �Ӽ��� �� ����� 
�� ������Ʈ���� ���� �ð� ���� ��Ÿ����.

Employee(empno(n, not null), name(v2), phoneno(v2), 
address(v2), sex(v2), position(v2), deptno(n))
Department(deptno(n, not null), deptname(v2), manager(v2))
Project(projno(n, not null), projname(v2), deptno(n))
Works(empno(n, not null), projno(n, not null), hours-worked(n))
*/

--primary key ����
--Employee:empno
--Department:deptno
--Project:projno
--Works:empno, projno *primary key ���� �ο� -> primary key(empno, projno)

--foreign key ����
--Employee:empno
--Project:Department(deptno), Project(projno)

--Employee ���̺� ����
drop table Employee;

create table Employee(
empno number(10) not null, 
name varchar2(20), 
phoneno varchar2(20), 
address varchar2(40), 
sex varchar2(10), 
position varchar2(30), 
deptno number(10), 
primary key(empno), 
foreign key(deptno) references Department(deptno)
);

insert into Employee values(1, '������', '010-1234-5678', '����', '��', 
'programmer', 1);
insert into Employee values(2, '�̼���', '010-1232-3122', '����', '��', 
'programmer', 1);
insert into Employee values(3, '�ڿ���', '010-7685-1231', '����', '��', 
'salesperson', 2);
insert into Employee values(4, 'ȫ�浿', '010-1234-1546', '����', '��', 
'manager', 2);
insert into Employee values(5, '����', '010-1231-1112', '����', '��', 
'manager', 1);

select *
from Employee;

--Department ���̺� ����
drop table Department;

create table Department(
deptno number(10) not null, 
deptname varchar2(20), 
manager varchar2(20), 
primary key(deptno)
);

insert into Department values(1, 'IT', '����');
insert into Department values(2, 'Marketing', 'ȫ�浿');

select *
from Department;

--Project ���̺� ����
drop table Project;

create table Project(
projno number(10) not null, 
projname varchar2(20), 
deptno number(10), 
primary key(projno), 
foreign key(deptno) references Department(deptno)
);

insert into Project values(1, 'DB����', 1);
insert into Project values(2, '��������', 2);

select *
from Project;

--Works ���̺� ����
drop table Works;

create table Works(
empno number(10) not null, 
projno number(10) not null, 
hoursworked number(30),
primary key(empno, projno), 
foreign key(empno) references Employee(empno), 
foreign key(projno) references Project(projno)
);

insert into Works values(1, 1, 3);
insert into Works values(2, 1, 1);
insert into Works values(3, 2, 1);
insert into Works values(4, 2, 5);
insert into Works values(5, 1, 1);

select * 
from Works;