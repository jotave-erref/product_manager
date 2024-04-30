package com.jotaveerrefe.product.manager.domain.product;

public record ProductRefreshDetail(String name, Integer quantity) {
    public ProductRefreshDetail(Product product){
        this(product.getName(), product.getQuantity());
    }
}
