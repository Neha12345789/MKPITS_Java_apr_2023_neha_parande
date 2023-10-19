-- Create a view named monthly_rental_stats that displays the month, year, and the total number of rentals for each month in the rental table.
DROP VIEW monthly_rental_stats
CREATE VIEW monthly_rental_stats AS
SELECT MONTH(rental_date),YEAR(rental_date),COUNT(rental_date) FROM rental 
SELECT * FROM monthly_rental_stats
