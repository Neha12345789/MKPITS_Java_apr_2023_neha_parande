-- Create a view named customer_rental_info that displays the customer's first name, last name, email, rental date, and film title for each rental transaction in the Sakila database.
-- Utilize appropriate joins to obtain the necessary information.
DROP VIEW customer_rental_info
CREATE VIEW customer_rental_info AS
SELECT first_name, last_name, email, rental_date, title FROM customer join rental on customer.customer_id= rental.customer_id
join inventory on inventory.inventory_id= rental.inventory_id 
join film on film.film_id=inventory.inventory_id
SELECT * FROM customer_rental_info 
