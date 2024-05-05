create table category_product(
	product_id bigint not null,
	category_id bigint not null,
	foreign key (product_id) references products(id),
	foreign key (category_id) references category(id)
);