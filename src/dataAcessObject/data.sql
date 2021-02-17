create database data;

use data;

create table cities(
    id integer NOT NULL AUTO_INCREMENT,
    yearC integer,
    locationC varchar(45),
    primary key(id)
);