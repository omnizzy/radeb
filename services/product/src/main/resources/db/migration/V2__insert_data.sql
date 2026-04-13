-- Insert categories first (parent table)

INSERT INTO category (id, name, description) VALUES
                                                 (1, 'Electronics', 'Devices, gadgets and accessories'),
                                                 (2, 'Books', 'Printed and digital books'),
                                                 (3, 'Clothing', 'Men and women apparel'),
                                                 (4, 'Home', 'Home appliances and furniture'),
                                                 (5, 'Sports', 'Sporting goods and outdoor equipment'),
                                                 (6, 'Beauty', 'Beauty and personal care products'),
                                                 (7, 'Toys', 'Kids toys and games'),
                                                 (8, 'Automotive', 'Car accessories and tools');



-- Insert products (child table referencing category)

INSERT INTO product (id, name, description, available_quantity, price, category_id) VALUES
                                                                                        (1, 'iPhone 14', 'Apple smartphone', 50, 999.99, 1),
                                                                                        (2, 'Samsung TV', '55 inch smart TV', 20, 799.99, 1),
                                                                                        (3, 'Clean Code', 'A Handbook of Agile Software Craftsmanship', 100, 45.00, 2),
                                                                                        (4, 'T-Shirt', 'Cotton round neck t-shirt', 200, 15.99, 3),
                                                                                        (5, 'Sofa', 'Comfortable 3-seater sofa', 10, 499.99, 4),
                                                                                        (6, 'Football', 'Standard size football', 150, 25.00, 5),
                                                                                        (7, 'Dumbbells Set', 'Adjustable gym dumbbells', 75, 120.00, 5),
                                                                                        (8, 'Face Cream', 'Moisturizing skin cream', 180, 20.50, 6),
                                                                                        (9, 'Lego Set', 'Creative building blocks set', 60, 35.99, 7),
                                                                                        (10, 'Car Vacuum Cleaner', 'Portable car vacuum cleaner', 40, 60.00, 8);