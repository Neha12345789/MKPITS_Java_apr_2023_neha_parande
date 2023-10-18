use sakila 
drop table Result
CREATE TABLE Result(
Roll_no int,
Physics int,
Chemistry int,
Maths int);


Create table total_marks(
Roll_no int,
Total int
);
select * from total_marks
delimiter // 
Create Trigger insert_trigger
after 
insert on Result
for each row 
begin
insert into total_marks values (New.Roll_no, New.Physics+New.Chemistry+New.Maths);
end
//
delimiter

select * from Result
insert into Result Values (101, 20, 50, 60)
select * from total_marks












