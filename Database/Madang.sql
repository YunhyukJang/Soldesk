--name:demon_madang.sql
--서점 관리 database

--계정 생성
--create user madang identified by 12341234;

--권한 부여
--grant connect, resource to madang; 
--grant create table, create view to madang;

--데이터베이스 잠금 해제
--alter user madang account unlock;

--Book
--테이블 삭제
drop table Book;

--테이블 생성
create table Book(
bookid number(4) primary key, 
bookname varchar2(40), 
publisher varchar2(40), 
price number(8)
);

--입력
insert into Book values(1, '축구의 역사', '굿스포츠', 7000);
insert into Book values(2, '축구아는 여자', '나무수', 13000);
insert into Book values(3, '축구의 이해', '대한미디어', 22000);
insert into Book values(4, '골프 바이블', '대한미디어', 35000);
insert into Book values(5, '피겨 교본', '굿스포츠', 8000);
insert into Book values(6, '역도 단계별 학습', '굿스포츠', 6000);
insert into Book values(7, '야구의 추억', '이상미디어', 20000);
insert into Book values(8, '야구를 부탁해', '이상미디어', 13000);
insert into Book values(9, '올림픽 이야기', '삼성당', 7500);
insert into Book values(10, 'Olympic Champions', 'Pearson', 13000);

--검색
select * 
from book;

--Customer
drop table Customer;

create table Customer(
custid number(4) primary key, 
name varchar2(40), 
address varchar2(50), 
phone varchar2(20)
);

insert into Customer values(1, '박지성', '영국 맨체스타', '000-5000-0001');
insert into Customer values(2, '김연아', '대한민국 서울', '000-6000-0001');
insert into Customer values(3, '장미란', '대한민국 강원도', '000-7000-0001');
insert into Customer values(4, '추신수', '미국 클리블랜드', '000-8000-0001');
insert into Customer values(5, '박세리', '대한민국 대전', null);

select * 
from Customer;

--Orders
drop table Orders;

create table Orders(
orderid number(4) primary key, 
custid number(4) references customer(custid), 
bookid number(4) references book(bookid), 
saleprice number(8), 
orderdate DATE
);

insert into Orders values(1, 1, 1, 6000, to_date('2021-07-01', 'yyyy-mm-dd'));
insert into Orders values(2, 1, 3, 21000, to_date('2021-07-03', 'yyyy-mm-dd'));
insert into Orders values(3, 2, 5, 8000, to_date('2021-07-03', 'yyyy-mm-dd'));
insert into Orders values(4, 3, 6, 6000, to_date('2021-07-04', 'yyyy-mm-dd'));
insert into Orders values(5, 4, 7, 20000, to_date('2021-07-05', 'yyyy-mm-dd'));
insert into Orders values(6, 1, 2, 12000, to_date('2021-07-07', 'yyyy-mm-dd'));
insert into Orders values(7, 4, 8, 13000, to_date('2021-07-07', 'yyyy-mm-dd'));
insert into Orders values(8, 3, 10, 12000, to_date('2021-07-08', 'yyyy-mm-dd'));
insert into Orders values(9, 2, 10, 7000, to_date('2021-07-09', 'yyyy-mm-dd'));
insert into Orders values(10, 3, 8, 13000, to_date('2021-07-10', 'yyyy-mm-dd'));

select * 
from orders;