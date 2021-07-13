--department 테이블 생성
drop table department;

create table department(
id number(10) not null primary key, 
depart_num varchar2(20), 
depart_tel varchar2(20)
);

--data 입력
insert into department values(1, '방송연예과', '02-0000-0000');
insert into department values(2, '방송연예과', '02-1111-1111');
insert into department values(5, null, null);
insert into department values(3, '기획과', '02-2222-2222');
insert into department values(4, '음향관리과', '02-3333-3333');

select *
from department;

--userInfo 테이블 생성
--id가 기본 키면서 공백 허용 안 함
drop table userInfo;

create table userInfo(
id number(10) not null primary key, 
name varchar2(20), 
loginId varchar2(20), 
email varchar2(20), 
foreign key(id) references department(id)
);

insert into userInfo values(1, '이채이', '272', '272@naver.com');
insert into userInfo values(2, '김희선', 'kim', 'kim@gmail.com');
insert into userInfo values(3, '송혜교', 'song', 'song@daum.net');
insert into userInfo values(5, '전지현', 'jeon', 'jeon@gmail.com');

select *
from userInfo;

--inner join(natural join)
--방법 1. oracle
select userInfo.id, userInfo.name, userInfo.email, 
department.depart_num, department.depart_tel
from userInfo, department
where userInfo.id=department.id;

--방법 2. 
select userInfo.id, userInfo.name, userInfo.email, 
department.depart_num, department.depart_tel
from userInfo
inner join department
on userInfo.id=department.id;

--방법 3. 
select userInfo.id, userInfo.name, userInfo.email, 
department.depart_num, department.depart_tel
from userInfo, department
where userInfo.id (+)= department.id;