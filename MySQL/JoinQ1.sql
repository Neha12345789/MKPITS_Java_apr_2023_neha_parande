use sakila 
-- Retrieve the names of all customers and the titles of the films they have rented.
select * from customer
select * from film
select * from rental
select first_name, last_name from customer join rental on customer.customer_id = rental.customer_id
join inventory on rental.inventory_id = inventory.inventory_id
join film on inventory.film_id = film.film_id
