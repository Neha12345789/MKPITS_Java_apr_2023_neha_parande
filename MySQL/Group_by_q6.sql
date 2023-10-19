 -- Calculate the count of rentals handled by each staff member
 use sakila 
 select * from staff
 select * from rental
 select * from payment
 
 select staff.first_name, staff.last_name, COUNT(rental.rental_id) from rental join payment on rental.customer_id = payment.customer_id
 join staff on payment.staff_id = staff.staff_id
 
 group by staff.staff_id
 
 