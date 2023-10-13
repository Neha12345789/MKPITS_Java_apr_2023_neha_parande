use sakila 
-- Get the titles of all films rented by the customer named "William Brown".
select * from film
select * from customer
select * from inventory
select * from store
select first_name, last_name, title from film join inventory on film.film_id = inventory.film_id join store on inventory.store_id = store.store_id join customer on store.store_id = customer.store_id where first_name= "MARIA" and last_name= "MILLER"