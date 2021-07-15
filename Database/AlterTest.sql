/*
-DDL(Data Definition Language)

-Table 생성
create table 테이블명

--Table 삭제
drop table 테이블명

--Table 수정
alter table 테이블명(수정 또는 추가되는 속성)
*/

--NewBook 테이블 생성
drop table NewBook;

create table NewBook(
bookid number, 
bookname varchar2(20), 
publisher varchar2(20), 
price number
);

--unique=중복 안됨
--default 10000=값이 없으면 10000
--check(price>1000)=가격은 최소 1000이상
create table NewBook(
bookid number not null, 
bookname varchar2(20), 
publisher varchar2(20) unique, 
price number default 10000 check(price>1000), 
primary key(bookid)
);

select * 
from NewBook;

--NewCustomer 테이블 생성
drop table NewCustomer;

create table NewCustomer(
custid number primary key, 
name varchar2(40), 
address varchar2(40), 
phone varchar2(30)
);

select * 
from NewCustomer;

--on delete cascade=연관 정보 모두 삭제
--NewOrders 테이블 생성
drop table NewOrders;

create table NewOrders(
orderid number, 
custid number not null, 
bookid number not null, 
saleprice number, 
orderdate date, 
primary key(orderid), 
foreign key(custid) references NewCustomer(custid) 
on delete cascade
);

select * 
from NewOrders;

--테이블 이름 변경(Newbook -> TB_newbook)
alter table Newbook rename to TB_newbook;

--TB_newbook에 속성 추가(isbn varchar2(20))
alter table TB_newbook add isbn varchar2(20);

--테이블 속성 검색
desc TB_newbook;

--number(2, 2) -> int, float
--TB_newbook에 isbn 타입을 number로 변경
alter table TB_newbook modify isbn number;

--속성의 이름 변경
alter table TB_newbook rename column isbn to iss;

--iss 속성 삭제
alter table TB_newbook drop column iss;

--TB_newbook primary key 삭제
alter table TB_newbook drop primary key;

--TB_newbook primary key 생성
alter table TB_newbook add primary key(bookid);

--not null 제약 조건 생성
alter table TB_newbook modify bookname varchar2(20) not null;

--NewOrders에 TB_newbook의 bookid를 foreign key로 설정
alter table NewOrders add constraint test_FK foreign key(bookid) 
references TB_newbook(bookid);

--NewOrders foreign key 삭제
alter table NewOrders drop constraint test_FK;