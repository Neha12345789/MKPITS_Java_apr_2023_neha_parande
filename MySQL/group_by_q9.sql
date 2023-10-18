-- Retrieve the total revenue generated for each city.
use sakila 
select * from payment
select * from city

select city.city, SUM(amount) from payment join staff on payment.staff_id = staff.staff_id 
join address on address.address_id= staff.address_id 
join city on city.city_id = address.city_id

group by city.city_id
 
