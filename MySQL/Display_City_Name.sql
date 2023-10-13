use sakila 
DELIMITER //
CREATE PROCEDURE `Display_Name_city` (v_city char(25))
BEGIN
-- declare cust_city char;
-- set cust_city=city;
Select first_name, last_name, city from city join address on 
city.city_id=address.city_id join customer on 
customer.address_id=address.address_id where city=v_city;
END
// 
DELIMITER ;
drop procedure Display_Name_city
call Display_Name_city("Dadu")