--procedure 실습
--판매 도서에 대한 이익금을 계산하는 프로그램
--매개변수가 없는 프로시저
--30000 이상이면 10%이익이 남고 나머지는 5%의 이익을 계산
create or replace procedure Interest
as 
myInterest number; --지역변수
price number; 
cursor InterestCursor 
is select saleprice 
from orders; 
begin
myInterest := 0.0; --변수 초기화
open InterestCursor; --커서 사용
loop 
fetch InterestCursor into price;
exit when InterestCursor%notfound;
if price >= 30000 
then myInterest := myInterest+price*0.1;
else myInterest := myInterest+price*0.05;
end if; --if 종료
end loop; --loop 종료
close InterestCursor; --커서가 모든 작업을 끝냄
dbms_output.put_line('전체 이익 금액=' || myInterest); --결과값 출력
end;
/

set serveroutput on;
exec Interest;