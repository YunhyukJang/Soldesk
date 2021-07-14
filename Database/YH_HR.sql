--계정 생성
create user soldesk identified by 12341234;
create user madang identified by 12341234;

--계정 잠금
alter user soldesk account lock;

--권한 부여
grant connect, resource to soldesk;
grant connect, resource to madang;
grant create table, create view to soldesk;
grant create table, create view to madang;