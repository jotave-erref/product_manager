create table clients(
    id bigint not null auto_increment,
    name varchar(150) not null,
    email varchar(150) not null unique,
    cpfOrCnpj varchar(15) not null unique,

    primary key (id)
);