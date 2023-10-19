-- Create a view named film_titles that displays the film_id, title, and release_year for all films in the Sakila database.

-- CREATE VIEW view_name AS  
-- SELECT column1, column2.....  
-- FROM table_name  
-- WHERE condition; 

CREATE VIEW film_titles AS
SELECT film_id, title, release_year
FROM film
SELECT * FROM film_titles


