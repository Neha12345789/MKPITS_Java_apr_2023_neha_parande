use sakila
CREATE TABLE Product(
product_id int,
product_name char(50),
quantity int 
);
select * from Product
INSERT INTO Product(product_id,
product_name,
quantity)
VALUES (101, 'Tea', 15),
(102, 'Coffee', 25),
(103, 'ColdDrink', 45),
(104, 'SoftDrink', 75);
DROP TABLE SALE
CREATE TABLE sale(
product_id int,
sale_id int,
Stock int
)
DELIMITER //
CREATE TRIGGER sale_trigger AFTER INSERT on sale 
FOR EACH ROW
BEGIN
UPDATE Product 
SET quantity = quantity - NEW.Stock
WHERE product_id = NEW.product_id;
END
//DELIMITER ;










