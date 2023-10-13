DROP TABLE Student_details;
DROP PROCEDURE Display_details;
CREATE TABLE Student_details(
Roll_no int,
Student_name char(25),
Physics int,
Chemistry int,
Maths int );
INSERT INTO Student_details (Roll_no, Student_name, Physics, Chemistry, Maths )
VALUES (101,'Neha Parande', 20, 25, 30),
(102,'Akshya banayat', 30, 35, 40),
(103, 'Mrunali Pardhi', 20, 25, 30);
select * from Student_details;
DELIMITER //
CREATE PROCEDURE Display_Details(Number1 int, Marks int)
BEGIN
update student_details set Physics= Physics+Marks, Chemistry= Chemistry+Marks, Maths=Maths+Marks WHERE Roll_no = Number1;
END
//
DELIMITER ;
call Display_Details(102, 100);
select * from student_details;



