
--
-- INSERT INTO STUDENT(ID, STUDENT_NAME,PASSPORT_ID)
-- VALUES('561', 'ROHAN','123');

--
-- INSERT INTO STUDENT(ID, STUDENT_NAME,PASSPORT_ID)
-- VALUES('562', 'SAHIL','124');





--
-- INSERT INTO PASSPORT(ID, PASSPORT_NUMBER,STUDENT_ID)
-- VALUES('123','E34567',NULL);
--
--
--

INSERT INTO STUDENT(ID, STUDENT_NAME)
VALUES('234', 'rahul');

INSERT INTO STUDENT(ID, STUDENT_NAME)
VALUES('560', 'ROHAN');

INSERT INTO STUDENT(ID, STUDENT_NAME)
VALUES('562', 'SAHIL');


INSERT INTO COURSES(COURSE_ID, COURSE_NAME)
VALUES('501', 'Spring');

INSERT INTO COURSES(COURSE_ID, COURSE_NAME)
VALUES('502', 'React');


INSERT INTO STUDENT_COURSES(STUDENT_ID, COURSE_ID)
VALUES('234', '501');
INSERT INTO STUDENT_COURSES(STUDENT_ID, COURSE_ID)
VALUES('234', '502');
INSERT INTO STUDENT_COURSES(STUDENT_ID, COURSE_ID)
VALUES('560', '501');




--
--
-- INSERT INTO PASSPORT(ID, PASSPORT_NUMBER,STUDENT_ID)
-- VALUES('124','E34567',560);
--
-- INSERT INTO PASSPORT(ID, PASSPORT_NUMBER,STUDENT_ID)
-- VALUES('125','E34569',560);