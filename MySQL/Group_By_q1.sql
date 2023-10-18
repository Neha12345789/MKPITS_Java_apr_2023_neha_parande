-- Retrieve the total revenue generated for each film category.
use sakila
select * from film_category -- film_id 
select * from film -- film_id
select * from inventory -- film_id, inventory_id
select * from rental -- inventory_id, customer_id
select * from payment -- customer_id 

select title, SUM(amount) from payment join rental on rental.customer_id = payment.customer_id
join inventory on inventory.inventory_id = rental.inventory_id 
join film on film.film_id = inventory.film_id
join film_category on film_category.film_id = film.film_id

group by film_category.film_id 


