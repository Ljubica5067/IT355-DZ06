DROP TABLE IF EXISTS proizvod, korpa;

CREATE TABLE proizvod (
                           id INT AUTO_INCREMENT PRIMARY KEY,
                           naziv VARCHAR(255),
                           cena DOUBLE
);

CREATE TABLE korpa (
                       id INT AUTO_INCREMENT PRIMARY KEY,
                       proizvod int,
                       kolicina int
);

INSERT INTO proizvod (naziv, cena) VALUES ('Televizor', 1299.99);
INSERT INTO proizvod (naziv, cena) VALUES ('Pametni sat', 199.99);
INSERT INTO proizvod (naziv, cena) VALUES ('Tablet', 349.99);
