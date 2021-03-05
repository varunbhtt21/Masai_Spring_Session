-- INSERT INTO Book(BookID, BookName, StudentName)
-- VALUES(1,'10001', 'Cormen', 'Rajesh');
--
-- INSERT INTO book (bid, bookId, bookName, studentName) VALUES
-- (12, '123', 'cormen', 'rahul'),


--
-- insert into student(id,studentId,studentName,studentClass)
-- values(1,'123', 'rohan', '10thclass');
--
-- INSERT INTO student (ID,student_Id,student_Name,student_Class) VALUES (4,'123', 'rohan', '10thclass');
-- INSERT INTO student (ID,student_Id,student_Name,student_Class) VALUES (6,'126', 'sohan', '11thclass');
--
-- --
-- -- insert into student
-- -- values(1,'124', 'sohan', '11thclass');
--
-- insert into book
-- values(1,'123', 'cormen', 'rahul',4);
--
-- insert into book
-- values(2,'123', 'cormen', 'rahul',4);




--
-- INSERT INTO PASSPORT(PASSPORT_ID, PASSPORT_NUMBER)
-- VALUES('123','E34567');
--
-- INSERT INTO PASSPORT(PASSPORT_ID, PASSPORT_NUMBER)
-- VALUES('124','E34567');
--
-- INSERT INTO PASSPORT(PASSPORT_ID, PASSPORT_NUMBER)
-- VALUES('125','E34569');
--
--
-- INSERT INTO STUDENT(ID, STUDENT_NAME,PASSPORT_ID)
-- VALUES('234', 'rahul',NULL);
--



INSERT INTO COURSE(COURSE_ID, COURSE_NAME)
VALUES('101', 'SPRING');

INSERT INTO COURSE(COURSE_ID, COURSE_NAME)
VALUES('102', 'REACT');

INSERT INTO COURSE(COURSE_ID, COURSE_NAME)
VALUES('103', 'ALGO');


--

INSERT INTO REVIEW(REVIEW_ID, RATING, DESCRIPTION, COURSE_COURSE_ID)
VALUES('201', '4', 'EXCELLENT', '101');

INSERT INTO REVIEW(REVIEW_ID, RATING, DESCRIPTION, COURSE_COURSE_ID)
VALUES('202', '4', 'Awesome', '103');


INSERT INTO REVIEW(REVIEW_ID, RATING, DESCRIPTION, COURSE_COURSE_ID)
VALUES('203', '4', 'Nice', '103');
