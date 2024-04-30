create table products(
    id bigint not null auto_increment,
    name varchar(100) not null,
    price double not null,
    quantity int not null,

    primary key (id)
);