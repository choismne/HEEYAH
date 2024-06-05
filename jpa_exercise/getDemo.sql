CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    comment TEXT
    );

INSERT INTO users (username, comment) VALUES ('choismn', 'This is a comment.');