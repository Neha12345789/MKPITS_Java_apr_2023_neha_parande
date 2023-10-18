-- Determine the count of rentals for each customer.
use sakila 
select * from rental
select * from customer
Select COUNT(rental_id) from rental join customer on customer.customer_id = rental.customer_id

group by customer.customer_id