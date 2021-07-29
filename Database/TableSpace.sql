--데이터를 저장하는 물리적 장치=하드디스크
--오라클에서는 시스템 운영에 필요한 데이터베이스의 기본 정보가 저장되는 논리적 공간이 필요함
--이를 TableSpace라고 함
create tablespace md_tbs 
datafile 'C:\Web Development\MADANG\oData\md_tbs_data01.dbf' 
size 10m;

create tablespace md_test 
datafile 'C:\Web Development\MADANG\oData\md_test_data01.dbf' 
size 10m;

--적용
create user mdguest identified by mdguest 
default tablespace md_tbs;

grant connect, resource to mdguest;

--조회
Select * 
from sys.dba_tablespaces;

--이름, 상태, 기본 사양
Select tablespace_name, status, contents 
from sys.dba_tablespaces;

--용량
Select * 
from sys.dba_data_files;

--남은 공간
Select * 
from sys.dba_free_space;

--삭제 *데이터 파일까지 모두 삭제
drop tablespace md_tbs including contents and datafiles;