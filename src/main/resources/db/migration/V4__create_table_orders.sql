create table orders(
	id bigint not null auto_increment,
	instant datetime not null,
    client_id bigint not null,
    foreign key (client_id) references clients(id),
	primary key (id)
);