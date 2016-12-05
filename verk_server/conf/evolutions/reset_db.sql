DROP DATABASE IF EXISTS verkiezingen;
CREATE DATABASE verkiezingen;
CREATE USER IF NOT EXISTS 'verk'@'localhost' IDENTIFIED BY 'password';
GRANT ALL ON verkiezingen.* TO 'verk'@'localhost';