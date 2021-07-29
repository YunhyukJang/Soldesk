--C(Create)
--R(Read)
--U(Update)
--D(Delete)

--insert into
insert into book values(11, '스포츠 의학', '솔데스크 서적', 9000);
insert into book(bookid, bookname, publisher) 
values(14, '스포츠 과학', '솔데스크 서적');

Select * from book;

drop table imported_book;

create table imported_book(
bookid number(10), 
bookname varchar2(20), 
publisher varchar2(20), 
price number(10)
);

Select * 
from imported_book;

insert into imported_book values(12, '스포츠 미래', '대한미디어', 12000);
insert into imported_book values(13, '요가의 정석', '솔데스크', 24000);
insert into imported_book values(15, '농구이야기', '대한미디어', 15000);
insert into imported_book values(16, '코로나19', '이상미디어', 27000);
insert into imported_book values(17, '코로나극복', '솔데스크', 24000);

--bulk insert/dump insert
insert into book(bookid, bookname, publisher, price)
Select bookid, bookname, publisher, price 
from imported_book;

--update set
Select * 
from customer;

update customer 
set address='대한민국 부산' 
where custid=5;

--중첩 질의를 활용한 update
--김연아의 주소와 박세리의 주소를 같은 곳으로 업데이트
update customer 
set address=(select address 
from customer 
where name like '김연아') 
where name like '박세리';

--delete from
delete from imported_book 
where bookid=12;

--book에서 삼성당 출판사 삭제
delete from book 
where publisher like '삼성당';

--대한미디어를 대한출판사로 변경
update book 
set publisher='대한출판사' 
where publisher='대한미디어';