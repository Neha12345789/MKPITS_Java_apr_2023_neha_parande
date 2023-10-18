use student
create table address(name_of_student char(20),city char(20))

insert into address values("Neha","nagpur")
insert into address values("Dadu","Nagpur")
insert into address values("ram","Pune")

show tables

select * from address


create table address_student(student_name char(20),city_new char(20))

call explicit_cursor_example()

select * from address_student

