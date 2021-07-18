select * 
from book;

select * 
from customer;

select * 
from orders;

--DML(Data Manipulation Language)
--insert into
--delete from
--update set
--select from
select phone 
from customer;

select *
from customer 
where name='김연아';

select name, phone 
from customer
where name='김연아';

--모든 도서의 이름과 가격 정보를 검색
select bookname, price
from book;

--모든 도서의 가격과 이름을 검색
select price, bookname 
from book;

--도서 테이블에서 출판사 검색
select publisher 
from book;

--출판사에서 중복성을 제거하고 출력
select distinct publisher 
from book;

--가격이 20000이하 도서의 모든 정보 검색
select * 
from book 
where price<=20000;

--가격이 10000이상, 20000이하 도서를 검색
select * 
from book 
where price >= 10000 and price <= 20000;

select * 
from book 
where price between 10000 and 20000;

--축구의 역사를 출간한 출판사 검색(도서명과 출판사 출력)
select bookname, publisher 
from book 
where bookname like '축구의 역사';

select bookname, publisher 
from book 
where bookname='축구의 역사';

--도서명에 '축구'가 포함된 도서를 출간한 출판사 검색
select * 
from book
where bookname like '%축구%';

--도서명에서 왼쪽 두 번째 위치한 글자가 '구'인 문자열을 갖는 도서 검색
select * 
from book 
where bookname like '_구%';

--축구에 관한 도서 중 가격이 20000원 이상인 도서를 검색
select * 
from book 
where bookname like '%축구%' and price>=20000;

--출판사가 '굿스포츠' 또는 '대한미디어'인 도서를 검색
select * 
from book 
where publisher like '굿스포츠' or publisher like '대한미디어';

--도서를 이름순으로 검색
select * 
from book 
order by bookname;

--도서를 가격순으로 검색하고 가격이 같으면 이름순으로 이차 정렬
select * 
from book 
order by price, bookname;

--도서를 가격의 내림차순으로 검색하고 만약 가격이 같으면 출판사를 오름차순으로 검색
select * 
from book 
order by price desc, publisher asc;

--도서번호가 1인 도서의 이름
select bookname 
from book 
where bookid like 1;

--박지성이 구매한 도서의 이름, 가격, 정가와 판매 가격 차이를 검색
select bookname, price, price-saleprice 
from book, orders, customer 
where customer.custid=orders.custid and orders.bookid=book.bookid 
and customer.name like '박지성';

--2021년 7월 4일~2021년 7월 7일 사이에 주문한 도서의 주문번호를 검색
select orderid 
from orders 
where orderdate between '21/07/04' and '21/07/07';

--2021년 7월 4일~2021년 7월 7일 사이에 주문한 도서를 제외한 주문번호를 검색
select orderid 
from orders 
where orderdate not between '21/07/04' and '21/07/07';

--성이 '김'씨인 고객의 이름과 주소를 검색
select name, address 
from customer 
where name like '김%';

--성이 '김'씨고 이름이 '아'로 끝나는 고객의 이름과 주소를 검색
select name, address 
from customer 
where name like '김%아';

--고객의 이름과 고객이 구매한 도서 목록을 검색
select name, bookname 
from book bk, customer ct, orders od 
where bk.bookid=od.bookid
and ct.custid=od.custid 
order by name;