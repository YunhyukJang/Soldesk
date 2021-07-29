--1. 계정 생성(U_HAKSA, 12345)
create user U_HAKSA identified by 12345;

--2. 권한 부여
grant connect, resource, create view to U_HAKSA;

--3. 테이블 생성
--HS_STUDENTS(학생)
drop table HS_STUDENTS;

create table HS_STUDENTS(
hs_stu_id varchar2(10) not null, 
hs_class_id varchar2(10), 
hs_prof_id varchar2(10), 
hs_stu_name varchar2(15) not null, 
hs_stu_num varchar2(14) not null, 
hs_stu_addr varchar2(100) not null, 
hs_stu_phnum varchar2(15) not null, 
hs_stu_email varchar2(100) not null, 
hs_stu_image long, 
hs_stu_sub varchar2(3) not null
);

--제약조건
alter table HS_STUDENTS add constraint hs_stu_id_pk primary key(hs_stu_id);
alter table HS_STUDENTS add constraint hs_class_id_fk foreign key(hs_class_id) 
references HS_CLASS_OFFICE(class_off_id);
alter table HS_STUDENTS add constraint hs_prof_id_fk foreign key(hs_prof_id) 
references HS_PROFESSOR(prof_id);

--제약조건 삭제
alter table HS_STUDENTS drop constraint hs_class_id_fk;
alter table HS_STUDENTS drop constraint hs_prof_id_fk;

Select * 
from HS_STUDENTS;

--HS_CLASS_OFFICE(학과)
drop table HS_CLASS_OFFICE;

create table HS_CLASS_OFFICE(
class_off_id varchar2(10) not null, 
class_off_name varchar2(20) not null, 
class_off_phnum varchar2(15) not null
);

--제약조건
alter table HS_CLASS_OFFICE add constraint class_off_id_pk primary key(class_off_id);

Select * 
from HS_CLASS_OFFICE;

--HS_PROFESSOR(교수)
drop table HS_PROFESSOR;

create table HS_PROFESSOR(
prof_id varchar2(10) not null, 
class_off_id varchar2(10) not null, 
hs_stu_id varchar2(10) not null, 
prof_name varchar2(15) not null, 
prof_iumin varchar2(14) not null, 
prof_addr varchar2(100) not null, 
prof_phnum varchar2(15) not null, 
prof_email varchar2(100) not null, 
prof_image long
);

--제약조건
alter table HS_PROFESSOR add constraint prof_id_pk primary key(prof_id);
alter table HS_PROFESSOR add constraint hs_stu_id_fk foreign key(hs_stu_id) 
references HS_STUDENTS(hs_stu_id);
alter table HS_PROFESSOR add constraint class_off_id_fk foreign key(class_off_id) 
references HS_CLASS_OFFICE(class_off_id);

--제약조건 삭제
alter table HS_PROFESSOR drop constraint hs_stu_id_fk;
alter table HS_PROFESSOR drop constraint class_off_id_fk;

Select * 
from HS_PROFESSOR;

--HS_LECTURE(강좌)
drop table HS_LECTURE;

create table HS_LECTURE(
lec_id varchar2(10) not null, 
prof_id varchar2(10) not null, 
lec_name varchar2(15) not null, 
lec_arch_grade char(1) not null, 
lec_time number(1) not null, 
lec_room varchar2(10) not null
);

--제약조건
alter table HS_LECTURE add constraint lec_id_pk primary key(lec_id);
alter table HS_LECTURE add constraint prof_id_fk foreign key(prof_id) 
references HS_PROFESSOR(prof_id);

--제약조건 삭제
alter table HS_LECTURE drop constraint prof_id_fk;

Select * 
from HS_LECTURE;

--REGIS_COURSE(수강)
drop table REGIS_COURSE;

create table REGIS_COURSE(
hs_stu_id varchar2(10) not null, 
lec_id varchar2(10) not null, 
prof_id varchar2(10) not null, 
rc_atten_grade number(10) not null, 
rc_midterm_grade number(10) not null, 
rc_finalterm_grade number(10) not null, 
rc_else_grade number(10) not null, 
rc_total number(10) not null, 
rc_avg_grade char(10)
);

--제약조건
alter table REGIS_COURSE add constraint stu_lec_prof_id_pk 
primary key(hs_stu_id, lec_id, prof_id);
alter table REGIS_COURSE add constraint lec_id_fk foreign key(lec_id) 
references HS_LECTURE(lec_id);

--제약조건 삭제
alter table REGIS_COURSE drop constraint lec_id_fk;

Select * 
from REGIS_COURSE;