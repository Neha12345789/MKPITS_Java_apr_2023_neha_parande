-- Calculate the average rental duration (in days) for each film.
use sakila
select * from rental 
select * from film

select title, AVG(rental_duration) from film 
group by film.title
