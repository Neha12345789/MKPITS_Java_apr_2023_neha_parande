CREATE DATABASE Employee

USE Employee

CREATE TABLE Employee_details(EmployeeId CHAR(20), employee_name CHAR(20), age INT);

SELECT * FROM Employee_details

INSERT INTO Employee_details VALUES('101','Neha',20),
								   ('104','shubham',21),
                                   ('102','sanket',22),
                                   ('103','pranay',24);
                                   
                                   
                                   
UPDATE Employee_details set EmployeeId = 202 WHERE EmployeeId = 101;
USE Employee 

DELETE FROM Employee_details WHERE EmployeeID = 104;
USE Employee
