CREATE TABLE IF NOT EXISTS user (
    id   INTEGER NOT NULL AUTO_INCREMENT,
    name VARCHAR(20) NOT NULL,
    email VARCHAR(50),
    age INT,
    PRIMARY KEY (id)
);