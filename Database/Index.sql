/*
인덱스는 테이블에서 한 개 이상의 속성을 이용하여 생성함.
빠른 검색과 함께 효율적인 레코드 접근이 가능함.
순서대로 정렬된 속성과 데이터의 위치만 보유하므로 테이블보다 작은 공간을 차지함.
저장된 값들은 테이블의 부분 집합이 됨.
일반적으로 B-tree 형태의 구조를 가짐.
데이터의 수정, 삭제 등의 변경이 발생하면 인덱스의 재구성이 필요함.
*/
create index ix_book 
on book(bookname);

create index ix_book2 
on book(publisher);

Select * 
from book 
where bookname like '축구의 역사';

Select * 
from book 
where publisher like '대한출판사' 
and price >= 30000;

Select * 
from book 
where bookid=1;

create index ix_hr 
on employees(first_name);

Select employee_id, last_name, job_id 
from employees 
where first_name like 'Steven';

create index ix_hr2 
on employees(last_name);

Select employee_id, first_name, job_id 
from employees 
where last_name like 'Popp';

--인덱스 재구성(초기화)
alter index ix_book rebuild;

--인덱스 삭제
drop index ix_book;

--customer에서 name으로 index 생성
create index ix_customer 
on customer(name);

--박세리 검색
Select * 
from customer 
where name like '박세리';

--삭제
drop index ix_customer;

--인덱스 활용
Select * 
from employees 
where salary >= 10000;

Select * 
from employees 
where job_id='AD_VP';

create index ix_employees 
on employees(salary);