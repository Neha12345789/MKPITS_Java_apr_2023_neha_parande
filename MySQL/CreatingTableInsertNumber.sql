CREATE TABLE Student_roll (roll_num int)
select * from Student_roll
DELIMITER // 
CREATE PROCEDURE Show_number()
BEGIN
Declare num int ; 
set num = 1;
while num <= 100 do 
INSERT INTO Student_roll values (num);
set num = num+1;
END while;
END 
//
DELIMITER ;
drop procedure Show_number;
call Show_Number();
select * from Student_roll
