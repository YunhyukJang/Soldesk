--내장함수
Select ABS(-78), ABS(+78) 
from dual;

Select round(4.785, 2) 
from dual;

Select custid "고객번호", round(sum(saleprice)/count(*), -2) "평균금액" 
from orders 
group by custid;

--문자함수
Select bookid, replace(bookname, '야구', '농구') bookname, price 
from book;

Select bookid, replace(replace(bookname, '축구', '발야구'), 
'피겨', '스키') bookname, price 
from book;

Select bookid, replace(replace(replace(bookname, '농구', '야구'), 
'발야구', '축구'), '스키', '피겨') bookname, price 
from book;

Select bookname "제목", length(bookname) "글자수", lengthb(bookname) "바이트수" 
from book 
where publisher='굿스포츠';

Select substr(name, 1, 1) "성", count(*) "인원" 
from customer 
group by substr(name, 1, 1);

--문자형 데이터를 날짜형으로 변환:to_date
--날짜형 데이터를 문자형으로 반환:to_char

--서적이 주문일로부터 3일 후 매출 확정을 한다. 각 주문의 확정 날짜를 계산
Select orderid "주문번호", orderdate "주문일", orderdate+3 "확정날짜" 
from orders;

--2021년 7월 7일에 주문받은 도서의 주문번호, 주문일, 고객번호, 도서번호를 출력
--단 날짜는 yyyy-mm-dd 형태의 문자로 한다.
Select orderid 주문번호, to_char(orderdate, 'yyyy-mm-dd') 주문일, 
custid 고객번호, bookid 도서번호 
from orders 
where orderdate=to_date('20210707', 'yyyy-mm-dd');

Select add_months(to_date('20210722', 'yyyy-mm-dd'), 3) 
from dual;

Select last_day(to_date('20211007', 'yyyy-mm-dd')) 
from dual;

Select systimestamp 
from dual;

Select sysdate, to_char(sysdate, 'yyyy-mm-dd dy hh24:mi:ss') "sysdate_1" 
from dual;

--null 처리
Select name 이름, nvl(phone, '연락처없음') 전화번호 
from customer;

--rownum
Select rownum 순번, custid, name, phone 
from customer 
where rownum <= 3;