create table order_item(
	id bigint not null auto_increment,
    discount double(10, 2) default 0.00,
    quantity int not null,
    price decimal (10,2) not null,
    product_id bigint not null,
    order_id bigint not null,
    foreign key (product_id) references products(id),
    foreign key (order_id) references orders(id),

    primary key (id)
);