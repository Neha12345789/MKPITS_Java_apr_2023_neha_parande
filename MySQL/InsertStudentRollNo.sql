CREATE TABLE Numbering (roll_num int)
select * from Numbering
select * from Student_roll
select MAX (roll_no) INTO num FROM Student_roll 
DELIMITER // 
CREATE PROCEDURE Call_number(counter int )
BEGIN
Declare counter int ; 
set counter = 1;
while counter do 
INSERT INTO Student_roll values (num);
set num = num+1;
END while;
END 
END 
//
DELIMITER ;
drop procedure Show_number;
call Show_Number();
select * from Student_roll
