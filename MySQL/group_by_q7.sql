-- Compute the average rental rate for each film category.
use sakila 
select * from film 
select * from film_category 
select * from category 

select film_category.category_id, AVG(rental_rate) from film join film_category on film.film_id=film_category.film_id 
join category on category.category_id=film_category.category_id

group by category.category_id