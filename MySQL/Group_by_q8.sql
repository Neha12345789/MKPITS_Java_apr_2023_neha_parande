-- Determine the count of rentals for each film..
use sakila 
select * from rental
select * from film

select title, count(rental_id) from rental join inventory on rental.inventory_id= inventory.inventory_id
join film on film.film_id=inventory.film_id

group by film.film_id

