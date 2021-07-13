--테이블 삭제
drop table memberTBL;

--memberTBL 테이블 생성
create table memberTBL(
memberID varchar2(8) not null primary key, 
memberName varchar2(10) not null, 
memberAddress varchar2(20)
);

--테이블 확인
select * 
from memberTBL;

drop table productTBL;

--productTBL 테이블 생성
create table productTBL(
productName varchar2(10) not null,
cost number(8) not null, 
makeDate date, 
company varchar2(10), 
amount number(8) not null, 
primary key(productName)
);

select *
from productTBL;

--Test
--customer_2
drop table customer_2;

create table customer_2(
name varchar2(20) not null primary key, 
city varchar2(20), 
industryType varchar2(20)
);

insert into customer_2 values('Tom', 'colombia', 'farming');
insert into customer_2 values('David', 'florida', 'computer');
insert into customer_2 values('James', 'goorgia', 'fishery');
insert into customer_2 values('Eric', 'arkansas', 'computer');
insert into customer_2 values('Sofia', 'la', 'fishery');
insert into customer_2 values('Julia', 'la', 'farming');
insert into customer_2 values('Adrian', 'cilorado', 'farming');

select *
from customer_2;

--salesPerson
drop table salesPerson;

create table salesPerson(
name varchar2(20) not null primary key,
age number, 
salary number(10)
);

insert into salesPerson values('Kevin', 28, 3500);
insert into salesPerson values('Angel', 32, 4000);
insert into salesPerson values('Daniel', 34, 2700);

select *
from salesPerson;

--orders_2
drop table orders_2;

create table orders_2(
orderId number not null primary key, 
custName varchar2(20), 
salesPerson varchar2(20), 
amount number(10), 
foreign key(custName) references customer_2(name), 
foreign key(salesPerson) references salesPerson(name)
);

insert into orders_2 values(1, 'Tom', 'Kevin', null);
insert into orders_2 values(2, 'David', 'Angel', null);
insert into orders_2 values(3, 'James', 'Daniel', null);
insert into orders_2 values(4, 'Eric', 'Kevin', null);
insert into orders_2 values(5, 'Sofia', 'Angel', null);
insert into orders_2 values(6, 'Julia', 'Daniel', null);
insert into orders_2 values(7, 'Adrian', 'Kevin', null);
insert into orders_2 values(8, 'Tom', 'Angel', null);
insert into orders_2 values(9, 'David', 'Daniel', null);
insert into orders_2 values(10, 'James', 'Kevin', null);
insert into orders_2 values(11, 'Eric', 'Angel', null);
insert into orders_2 values(12, 'Sofia', 'Daniel', null);
insert into orders_2 values(13, 'Julia', 'Kevin', null);

select *
from orders_2;