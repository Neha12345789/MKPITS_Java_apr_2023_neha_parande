use sakila
-- List the names of actors who have appeared in the film titled "Chamber Italian".
select * from actor
select first_name from actor join film_actor on actor.actor_id = film_actor.actor_id join film on film_actor.film_id = film.film_id where title = "Chamber Italian"
select * from film 

