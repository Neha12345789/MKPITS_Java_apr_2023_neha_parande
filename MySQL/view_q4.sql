-- Create a view named new_release_films that displays the film_id, title, and release_year for films released after the year 2005.
DROP VIEW new_release_films
CREATE VIEW new_release_films AS 
SELECT film_id, title, release_year FROM film
WHERE release_year >'2005'; 
SELECT * FROM new_release_films

