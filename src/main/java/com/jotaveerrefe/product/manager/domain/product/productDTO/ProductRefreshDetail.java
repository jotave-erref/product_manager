package com.jotaveerrefe.product.manager.domain.product.productDTO;

import com.jotaveerrefe.product.manager.domain.product.Product;

public record ProductRefreshDetail(String name, Integer quantity) {
    public ProductRefreshDetail(Product product){
        this(product.getName(), product.getQuantity());
    }
}
