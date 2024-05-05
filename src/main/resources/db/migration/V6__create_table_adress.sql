create table adress(
	id bigint not null auto_increment primary key,
    public_place varchar(255) not null,
    number_house integer not null,
    neighborhood varchar(255) not null,
    zip_code varchar(255) not null,
    adress_detail varchar(255) not null,
    client_id bigint not null,
    foreign key (client_id) references clients(id)
);