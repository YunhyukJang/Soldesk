--계정 생성
create user Employee identified by 12341234;

grant connect, resource to Employee;

alter user Employee account unlock;

/*
[기업 프로젝트 데이터베이스] 다음 릴레이션을 보고 물음에 답하시오.
Employee는 사원, Department는 부서, Project는 프로젝트 내용, Works는 사원이 
프로젝트에 참여한 내용을 나타낸다. 한 사원이 여러 프로젝트에서 일할 수 있고, 한 
프로젝트에서 여러 사원이 일할 수 있다. hours-worked 속성은 각 사원이 
각 프로젝트에서 일한 시간 수를 나타낸다.

Employee(empno(n, not null), name(v2), phoneno(v2), 
address(v2), sex(v2), position(v2), deptno(n))
Department(deptno(n, not null), deptname(v2), manager(v2))
Project(projno(n, not null), projname(v2), deptno(n))
Works(empno(n, not null), projno(n, not null), hours-worked(n))
*/

--primary key 생성
--Employee:empno
--Department:deptno
--Project:projno
--Works:empno, projno *primary key 동시 부여 -> primary key(empno, projno)

--foreign key 생성
--Employee:empno
--Project:Department(deptno), Project(projno)

--Employee 테이블 생성
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

insert into Employee values(1, '오세영', '010-1234-5678', '서울', '여', 
'programmer', 1);
insert into Employee values(2, '이서울', '010-1232-3122', '서울', '남', 
'programmer', 1);
insert into Employee values(3, '박연세', '010-7685-1231', '대전', '여', 
'salesperson', 2);
insert into Employee values(4, '홍길동', '010-1234-1546', '서울', '남', 
'manager', 2);
insert into Employee values(5, '고남순', '010-1231-1112', '서울', '여', 
'manager', 1);

select *
from Employee;

--Department 테이블 생성
drop table Department;

create table Department(
deptno number(10) not null, 
deptname varchar2(20), 
manager varchar2(20), 
primary key(deptno)
);

insert into Department values(1, 'IT', '고남순');
insert into Department values(2, 'Marketing', '홍길동');

select *
from Department;

--Project 테이블 생성
drop table Project;

create table Project(
projno number(10) not null, 
projname varchar2(20), 
deptno number(10), 
primary key(projno), 
foreign key(deptno) references Department(deptno)
);

insert into Project values(1, 'DB구축', 1);
insert into Project values(2, '시장조사', 2);

select *
from Project;

--Works 테이블 생성
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