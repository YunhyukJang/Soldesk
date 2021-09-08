drop table jdbc_test;

create table jdbc_test(
name varchar2(20), 
email varchar2(40)
);

Select * 
from jdbc_test;

drop table member;

create table member(
id varchar2(20), 
pw1 varchar2(20), 
pw2 varchar2(20), 
email varchar2(20), 
gender varchar2(20), 
address varchar2(40), 
phone varchar2(20), 
hobby varchar2(40), 
job varchar2(20), 
age varchar2(20), 
info varchar2(40)
);

Select * 
from member;

drop table bank1;

create table bank1(
aID int primary key not null, 
aName varchar2(20), 
balance int
);

Select * 
from bank1;

insert into bank1 values(101, 'user1', 20000);

drop table bank2;

create table bank2(
aID int primary key not null, 
aName varchar2(20), 
balance int
);

Select * 
from bank2;

insert into bank2 values(201, 'user2', 10);

commit;