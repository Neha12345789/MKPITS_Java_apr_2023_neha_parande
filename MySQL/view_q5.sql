-- Create a hierarchical view named film_actors_hierarchy that displays the film title and the actors for each film,
-- organized in a hierarchical structure, using the film and actor tables.
Drop view film_actors_hierarchy
CREATE VIEW film_actors_hierarchy AS
SELECT first_name, last_name, title FROM film join film_actor on film.film_id = film_actor.film_id 
join actor on actor.actor_id = film_actor.actor_id
SELECT * FROM film_actors_hierarchy