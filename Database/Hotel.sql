--Hotel 계정 생성
create user Hotel identified by 12341234;

--Hotel에 권한 부여
grant connect, resource to Hotel;
grant create table, create view, create procedure to Hotel;

/*
호텔(주소, 이름, 도시, 가격, 방의 수)
고객(고객번호, 이름, 주소, 전화번호)
예약(호텔주소, 고객번호, 투숙객 수, 예약일, 출발일, 도착일)
투숙(호텔주소, 고객번호, 실제 도착일, 실제 출발일, 선급금, 지불방법)

primary key
호텔:주소
고객:고객번호
예약:고객번호, 호텔주소
투숙:고객번호, 호텔주소
*/