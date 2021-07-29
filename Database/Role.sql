--역할 생성/삭제
--create/drop role

--system 계정에서 진행
create role programmer;

--역할에 권한 부여
grant create any table, create view, create procedure to programmer;

--역할의 권한 회수
revoke create table, create view, create procedure from programmer;

--역할을 분배
grant programmer to yhguest;

--접속되어 있는 모든 database에게 역할을 받을 수 있도록 설정
set role all;

--역할을 회수
revoke programmer from yhguest;

--yhguest 계정에서 진행
create table soldesk.newtable(
myname varchar2(40), 
myphone varchar2(20)
);

insert into soldesk.newtable values('홍길동', '000-0001-0002'); --Error

--system 계정에서 진행
--역할 추가
grant select, insert on soldesk.newtable to programmer;

--yhguest 계정에서 진행
insert into soldesk.newtable values('홍길동', '000-0001-0002');

Select * 
from soldesk.newtable;

--역할 회수
revoke select on soldesk.newtable from programmer;

--yhguest 계정에서 진행
Select * 
from soldesk.newtable; --Error

--역할 삭제
drop role programmer;