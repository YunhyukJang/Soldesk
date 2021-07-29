select * 
from book;

select * 
from customer;

select * 
from orders;

--고객이 주문한 도서의 총 금액
select sum(saleprice) as "총 매출" 
from orders;

--2번 김연아 고객이 주문한 도서의 총 금액
select sum(saleprice) as "총 매출" 
from orders 
where custid=2;

--고객이 주문한 도서의 총 판매 금액, 평균값, 최저가, 최고가
select sum(saleprice) as Total, 
avg(saleprice) as Average, 
min(saleprice) as Minimum, 
max(saleprice) as Maximum
from orders;

--도서 판매 수
select count(*) 
from orders;

--도서 판매 가격이 20000이상인 판매 건수
select count(case when saleprice >= 20000 then 1 end) as VIP 
from orders;

--도서 판매 가격이 20000이상인 판매 건수와 10000이하의 판매 건수
select count(case when saleprice >= 20000 then 1 end) as VIP, 
count(case when saleprice <= 10000 then 1 end) as CS 
from orders;

--고객별 주문한 도서의 총 수량과 총 금액
select count(*) as "도서 수량", sum(saleprice) as "총 금액" 
from orders 
group by custid;

--가격이 8000이상인 도서에 대한 고객별 총 수량(단 두 권 이상 구매한 고객)
select custid, count(*) as "총 수량" 
from orders 
where saleprice >= 8000 
group by custid 
having count(*) >= 2;

--고객별 이름과 고객이 주문한 도서의 판매 가격
select name, sum(saleprice) 
from customer ct, orders od 
where ct.custid=od.custid
group by ct.name;

--Oracle join
--고객의 이름과 주문한 도서의 이름
select name, bookname 
from customer ct, book bk, orders od 
where ct.custid=od.custid and bk.bookid=od.bookid;

--일반적인 join
select name, bookname 
from orders od 
inner join book bk on od.bookid=bk.bookid 
inner join customer ct on od.custid=ct.custid;

--Oracle join
--가격이 20000이상인 도서를 구매한 고객의 이름과 주문한 도서의 이름
select name, bookname 
from customer ct, book bk, orders od 
where ct.custid=od.custid and bk.bookid=od.bookid 
and bk.price >= 20000;

--일반적인 join
select name, bookname 
from orders od 
inner join book bk on od.bookid=bk.bookid 
inner join customer ct on od.custid=ct.custid 
where bk.price >= 20000;

--박지성이 구매한 도서의 총 금액
select sum(saleprice) 
from customer ct, orders od 
where ct.custid=od.custid 
and ct.name like '박지성';

--inner join
select sum(saleprice) 
from orders od 
inner join customer ct on od.custid=ct.custid 
where ct.name like '박지성';

--박지성이 구매한 도서의 수
select count(*) 
from customer ct, orders od 
where ct.custid=od.custid 
and ct.name like '박지성';

--박지성이 구매한 도서의 출판사 수
select count(distinct publisher) 
from book bk, customer ct, orders od 
where bk.bookid=od.bookid and ct.custid=od.custid 
and ct.name like '박지성';

--마당 서점의 총 도서 갯수
select count(*) 
from book;

--마당 서점이 거래하고 있는 출판사의 수
select count(distinct publisher) 
from book;

--도서를 구매하지 않은 고객을 포함하여 고객의 이름과 주문한 도서의 판매 가격을 검색
--outer join
select name, saleprice 
from customer ct left outer join orders od 
on od.custid=ct.custid;

--right outer join=inner join
select name, saleprice 
from customer ct right outer join orders od 
on od.custid=ct.custid;