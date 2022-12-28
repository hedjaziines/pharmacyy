create database crud;
use crud;
create table products(
name varchar(20) NOT NULL,
price double NOT NULL,
Qte int NOT NULL,
EXP date Not NULL,
company varchar(40) NOT NULL,

PRIMARY KEY(name)
);

insert into Products(name) values("DOLIPRANE");
