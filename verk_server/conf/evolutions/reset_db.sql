CREATE DATABASE IF NOT EXISTS verkiezingen;
CREATE USER 'verk'@'localhost' IDENTIFIED BY 'password';
GRANT ALL ON verkiezingen.* TO 'verk'@'localhost';