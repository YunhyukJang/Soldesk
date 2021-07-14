--계정 생성
create user movie identified by 12341234;

--계정 추가
alter user movie account unlock;

--계정 비밀번호 변경 *system or sys
alter user movie identified by 12341234;

/*
sys 및 system 계정으로 접속
1. cmd 창에서 sqlplus 실행
2. 사용자명 입력:sys as sysdba
3. 비밀번호 입력:
4. alter user sys identified by 12341234; *비밀번호 변경
5. conn sys/12341234 as sysdba
*/

--권한 설정
grant connect, resource to movie;
grant create table, create view, create sequence, 
create procedure, create session to movie;

--계정 삭제
drop user movie;

drop user movie cascade;

--계정 관리(DML 권한 부여)
grant select on Employee to movie;
grant insert on Employee to movie;
grant delete on Employee to movie;
grant update on Employee to movie;

--한 번에 권한 설정
grant select, insert, delete, update on Employee to movie;

--계정 관리(DML 권한 해제)
revoke select on Employee from movie;
revoke insert on Employee from movie;
revoke delete on Employee from movie;
revoke update on Employee from movie;

--한 번에 권한 해제
revoke select, insert, delete, update on Employee from movie;