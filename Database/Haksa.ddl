-- 생성자 Oracle SQL Developer Data Modeler 21.2.0.165.1515
--   위치:        2021-07-29 16:10:46 KST
--   사이트:      Oracle Database 11g
--   유형:      Oracle Database 11g



CREATE USER u_haksa 
    IDENTIFIED BY  
    DEFAULT TABLESPACE SYSTEM 
    ACCOUNT UNLOCK 
;

GRANT CREATE VIEW,
    CREATE TABLE,
    UNLIMITED TABLESPACE
TO u_haksa 
;

-- predefined type, no DDL - MDSYS.SDO_GEOMETRY

-- predefined type, no DDL - XMLTYPE

CREATE TABLE u_haksa.hs_class_office (
    class_off_id    VARCHAR2(10 BYTE) NOT NULL,
    class_off_name  VARCHAR2(20 BYTE) NOT NULL,
    class_off_phnum VARCHAR2(15 BYTE) NOT NULL
)
PCTFREE 10 PCTUSED 40 TABLESPACE system LOGGING
    STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT );

CREATE UNIQUE INDEX u_haksa.class_off_id_pk ON
    u_haksa.hs_class_office (
        class_off_id
    ASC )
        TABLESPACE system PCTFREE 10
            STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL
            DEFAULT )
        LOGGING;

ALTER TABLE u_haksa.hs_class_office
    ADD CONSTRAINT class_off_id_pk PRIMARY KEY ( class_off_id )
        USING INDEX u_haksa.class_off_id_pk;

CREATE TABLE u_haksa.hs_lecture (
    lec_id         VARCHAR2(10 BYTE) NOT NULL,
    prof_id        VARCHAR2(10 BYTE),
    lec_name       VARCHAR2(15 BYTE) NOT NULL,
    lec_arch_grade CHAR(1 BYTE) NOT NULL,
    lec_time       NUMBER(1) NOT NULL,
    lec_room       VARCHAR2(10 BYTE) NOT NULL
)
PCTFREE 10 PCTUSED 40 TABLESPACE system LOGGING
    STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT );

CREATE UNIQUE INDEX u_haksa.lec_id_pk ON
    u_haksa.hs_lecture (
        lec_id
    ASC )
        TABLESPACE system PCTFREE 10
            STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL
            DEFAULT )
        LOGGING;

ALTER TABLE u_haksa.hs_lecture
    ADD CONSTRAINT lec_id_pk PRIMARY KEY ( lec_id )
        USING INDEX u_haksa.lec_id_pk;

CREATE TABLE u_haksa.hs_professor (
    prof_id      VARCHAR2(10 BYTE) NOT NULL,
    class_off_id VARCHAR2(10 BYTE),
    hs_stu_id    VARCHAR2(10 BYTE) NOT NULL,
    prof_name    VARCHAR2(15 BYTE) NOT NULL,
    prof_iumin   VARCHAR2(14 BYTE) NOT NULL,
    prof_addr    VARCHAR2(100 BYTE) NOT NULL,
    prof_phnum   VARCHAR2(15 BYTE) NOT NULL,
    prof_email   VARCHAR2(100 BYTE) NOT NULL,
    prof_image   LONG
)
PCTFREE 10 PCTUSED 40 TABLESPACE system LOGGING
    STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT );

CREATE UNIQUE INDEX u_haksa.prof_id_pk ON
    u_haksa.hs_professor (
        prof_id
    ASC )
        TABLESPACE system PCTFREE 10
            STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL
            DEFAULT )
        LOGGING;

ALTER TABLE u_haksa.hs_professor
    ADD CONSTRAINT prof_id_pk PRIMARY KEY ( prof_id )
        USING INDEX u_haksa.prof_id_pk;

CREATE TABLE u_haksa.hs_students (
    hs_stu_id    VARCHAR2(10 BYTE) NOT NULL,
    hs_class_id  VARCHAR2(10 BYTE),
    hs_prof_id   VARCHAR2(10 BYTE),
    hs_stu_name  VARCHAR2(15 BYTE) NOT NULL,
    hs_stu_num   VARCHAR2(14 BYTE) NOT NULL,
    hs_stu_addr  VARCHAR2(100 BYTE) NOT NULL,
    hs_stu_phnum VARCHAR2(15 BYTE) NOT NULL,
    hs_stu_email VARCHAR2(100 BYTE) NOT NULL,
    hs_stu_image LONG,
    hs_stu_sub   VARCHAR2(3 BYTE) NOT NULL
)
PCTFREE 10 PCTUSED 40 TABLESPACE system LOGGING
    STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT );

CREATE UNIQUE INDEX u_haksa.hs_stu_id_pk ON
    u_haksa.hs_students (
        hs_stu_id
    ASC )
        TABLESPACE system PCTFREE 10
            STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL
            DEFAULT )
        LOGGING;

ALTER TABLE u_haksa.hs_students
    ADD CONSTRAINT hs_stu_id_pk PRIMARY KEY ( hs_stu_id )
        USING INDEX u_haksa.hs_stu_id_pk;

CREATE TABLE u_haksa.regis_course (
    hs_stu_id          VARCHAR2(10 BYTE),
    lec_id             VARCHAR2(10 BYTE),
    prof_id            VARCHAR2(10 BYTE) NOT NULL,
    rc_atten_grade     NUMBER(10) NOT NULL,
    rc_midterm_grade   NUMBER(10) NOT NULL,
    rc_finalterm_grade NUMBER(10) NOT NULL,
    rc_else_grade      NUMBER(10) NOT NULL,
    rc_total           NUMBER(10) NOT NULL,
    rc_avg_grade       CHAR(10 BYTE)
)
PCTFREE 10 PCTUSED 40 TABLESPACE system LOGGING
    STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT );

CREATE UNIQUE INDEX u_haksa.stu_lec_prof_id_pk ON
    u_haksa.regis_course (
        hs_stu_id
    ASC,
        lec_id
    ASC,
        prof_id
    ASC )
        TABLESPACE system PCTFREE 10
            STORAGE ( INITIAL 65536 NEXT 1048576 PCTINCREASE 0 MINEXTENTS 1 MAXEXTENTS 2147483645 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL
            DEFAULT )
        LOGGING;

ALTER TABLE u_haksa.regis_course ADD CONSTRAINT stu_lec_prof_id_pk PRIMARY KEY ( prof_id );

ALTER TABLE u_haksa.hs_lecture
    ADD CONSTRAINT hs_lecture_hs_professor_fk FOREIGN KEY ( prof_id )
        REFERENCES u_haksa.hs_professor ( prof_id )
    NOT DEFERRABLE;

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE u_haksa.hs_professor
    ADD CONSTRAINT hs_professor_hs_class_office_fk FOREIGN KEY ( class_off_id )
        REFERENCES u_haksa.hs_class_office ( class_off_id )
    NOT DEFERRABLE;

ALTER TABLE u_haksa.hs_students
    ADD CONSTRAINT hs_students_hs_class_office_fk FOREIGN KEY ( hs_class_id )
        REFERENCES u_haksa.hs_class_office ( class_off_id )
    NOT DEFERRABLE;

ALTER TABLE u_haksa.regis_course
    ADD CONSTRAINT regis_course_hs_lecture_fk FOREIGN KEY ( lec_id )
        REFERENCES u_haksa.hs_lecture ( lec_id )
    NOT DEFERRABLE;

ALTER TABLE u_haksa.regis_course
    ADD CONSTRAINT regis_course_hs_students_fk FOREIGN KEY ( hs_stu_id )
        REFERENCES u_haksa.hs_students ( hs_stu_id )
    NOT DEFERRABLE;



-- Oracle SQL Developer Data Modeler 요약 보고서: 
-- 
-- CREATE TABLE                             5
-- CREATE INDEX                             5
-- ALTER TABLE                             10
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              1
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   1
-- WARNINGS                                 0
