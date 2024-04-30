package com.jotaveerrefe.product.manager.domain.product;

public record ProductData(Long id, String name, Double price, Integer quantity) {

    public ProductData(Product product){
        this(product.getId(), product.getName(), product.getPrice(), product.getQuantity());
    }
}
