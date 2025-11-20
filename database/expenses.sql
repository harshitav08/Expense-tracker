CREATE TABLE expenses (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(100),
    category VARCHAR(50),
    amount DECIMAL(10,2),
    date DATE
);

INSERT INTO expenses(title, category, amount, date) 
VALUES ("Lunch", "Food", 120, "2025-01-01");
