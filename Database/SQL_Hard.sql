--입력
--극장
insert into 극장 values(1, '대한', '강남'); 
insert into 극장 values(2, '씨티', '강남'); 
insert into 극장 values(3, '씨티', '잠실');
insert into 극장 values(4, 'CGV', '서울시 강남구'); 
insert into 극장 values(5, '메가박스', '서울시 도봉구');

--상영관
insert into 상영관 values(1, 1, '신세계', 9000, 35); 
insert into 상영관 values(1, 2, '영웅호걸', 9000, 40); 
insert into 상영관 values(3, 3, '러브레터', 9000, 10);
insert into 상영관 values(3, 4, '범죄의 도시', 7000, 50); 
insert into 상영관 values(3, 5, '신과 함께', 7500, 20);

--고객
insert into 고객 values(1, '장민태', '서울시 강동구');
insert into 고객 values(2, '홍길동', '서울시 도봉구');
insert into 고객 values(3, '김유신', '서울시 강남구');
insert into 고객 values(4, '오재호', '서울시 강남구');
insert into 고객 values(5, '정현석', '서울시 도봉구');

--예약
insert into 예약 values(1, 1, 1, 30, to_date('2019-10-15', 'yyyy-mm-dd'));
insert into 예약 values(2, 1, 2, 25, to_date('2019-10-15', 'yyyy-mm-dd'));
insert into 예약 values(3, 1, 3, 35, to_date('2019-10-17', 'yyyy-mm-dd'));
insert into 예약 values(4, 2, 4, 20, to_date('2020-09-01', 'yyyy-mm-dd'));
insert into 예약 values(4, 3, 3, 10, to_date('2020-09-01', 'yyyy-mm-dd'));
insert into 예약 values(1, 3, 2, 40, to_date('2020-09-01', 'yyyy-mm-dd'));
insert into 예약 values(3, 1, 2, 45, to_date('2020-09-01', 'yyyy-mm-dd'));
insert into 예약 values(2, 2, 1, 50, to_date('2020-09-01', 'yyyy-mm-dd'));
insert into 예약 values(2, 3, 1, 55, to_date('2020-09-01', 'yyyy-mm-dd'));
insert into 예약 values(1, 2, 4, 15, to_date('2020-09-01', 'yyyy-mm-dd'));

--모든 극장의 이름과 위치를 보이시오.
Select 극장이름, 위치 
from 극장;

--'잠실'에 있는 극장을 보이시오.
Select * 
from 극장 
where 위치 like '잠실';

--'서울시 강남구'에 사는 고객의 정보를 보이되 이름을 오름차순으로 보이시오.
Select * 
from 고객 
where 주소 like '서울시 강남구' 
order by 이름;

--가격이 8,000원 이하인 영화의 극장번호, 상영관번호, 영화제목을 보이시오.
Select 극장번호, 상영관번호, 영화제목 
from 상영관 
where 가격 <= '8000';

--극장 위치와 고객의 주소가 같은 고객들을 보이시오.
Select * 
from 극장, 고객 
where 극장.위치=고객.주소;

--집계함수
--극장의 수는 몇 개인가?
Select count(*) 
from 극장;

--상영되는 영화의 평균 가격은 얼마인가?
Select avg(가격) 
from 상영관;

--2020년 9월 1일에 영화를 관람한 고객의 수는 얼마인가?
Select count(*) 
from 예약 
where 날짜 like '20/09/01';

--부속질의
--'대한'극장에서 상영된 영화제목을 보이시오.
Select 영화제목 
from 극장, 상영관 
where 극장.극장번호=상영관.극장번호 
and 극장이름 like '대한';

--'대한'극장에서 영화를 본 고객의 이름을 보이시오.
Select 이름 
from 극장, 고객, 예약 
where 극장.극장번호=예약.극장번호 and 고객.고객번호=예약.고객번호 
and 극장이름 like '대한';

--'대한'극장의 전체 수입을 보이시오.
Select sum(가격) 
from 극장, 상영관, 예약  
where 극장.극장번호=상영관.극장번호 and 상영관.극장번호=예약.극장번호 
and 예약.상영관번호=상영관.상영관번호 
and 극장이름 like '대한';

--그룹
--극장별 상영관 수를 보이시오.
Select 극장번호, count(*) 
from 상영관 
group by 극장번호;

--2020년 9월 1일에 극장별 평균 관람 고객의 수를 보이시오.
Select 극장번호, count(*) 
from 예약 
where 날짜 like to_date('2020-09-01', 'yyyy-mm-dd') 
group by 극장번호;

--2020년 9월 1일에 가장 많은 고객이 관람한 영화의 제목을 보이시오.
Select 영화제목 
from 예약, 상영관 
where 예약.상영관번호=상영관.상영관번호 
and 날짜 like to_date('2020-09-01', 'yyyy-mm-dd')
group by 상영관.영화제목 
having count(*) 
in (select max(count(*)) 
from 예약, 상영관 
where 예약.상영관번호=상영관.상영관번호 
and 날짜 like to_date('2020-09-01', 'yyyy-mm-dd')
group by 상영관.영화제목);

--영화 가격 10% 인상
Update 상영관 
set 가격=가격*1.1;