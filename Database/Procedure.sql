--pl/sql
--in:입력 *매개변수
create or replace procedure insertBook(
mybookID in number, 
mybookName in varchar2, 
myPublisher in varchar2, 
myPrice in number
) as begin
insert into book(bookid, bookname, publisher, price) 
values(mybookID, mybookName, myPublisher, myPrice); 
end;
/

exec insertBook(50, '스포츠과학', '마당과학서점', 25000);

--같은 이름의 서적이 존재하면 입력이 되지 않고 업데이트 수행
--같은 이름의 서적이 없으면 입력
create or replace procedure BookInsertOrUpdate(
mybookID number, 
mybookName varchar2, 
myPublisher varchar2, 
myPrice number
) as myCount number; --지역변수로써 같은 도서가 있는지 카운트로 확인
begin 
select count(*) into myCount from book 
where bookName like mybookName;
if mycount != 0 --myCount 값이 들어오면 같은 값이 있다고 판단
then update book set price=myPrice 
where bookName like mybookName;
else insert into book(bookid, bookname, publisher, price) 
values(mybookID, mybookName, myPublisher, myPrice);
end if; --if 종료
end; --procedure 종료
/

exec BookInsertOrUpdate(8, '야구를 부탁해', '이상미디어', 18000);
exec BookInsertOrUpdate(51, '축구를 부탁해', '대한미디어', 15000);

--book 테이블에 저장된 도서의 평균 가격을 반환하는 프로그램
create or replace procedure AveragePrice(
averageVal out number --out형 매개변수
) as 
begin
select avg(price) into averageVal from book 
where price is not null;
end;
/

/*
AveragePrice test
dbms_output.put_line에 의한 출력 여부를 설정
*/
set serveroutput on; --서버 on
declare averageVal number; --변수 선언
begin
AveragePrice(averageVal);
dbms_output.put_line('책의 평균값:' || round(AverageVal, 2));
end;