-- Calculate the count of rentals for each film language.
use sakila
select * from rental
select * from inventory
select * from film
select * from language

select language.language_id, name,COUNT(rental.rental_id) from rental join inventory
 on rental.inventory_id = inventory.inventory_id  join film 
 on inventory.film_id= film.film_id join language
 on film.language_id= language.language_id

group by language.language_id

