package com.jotaveerrefe.product.manager.domain.product.productDTO;

import com.jotaveerrefe.product.manager.domain.product.Product;

import java.math.BigDecimal;

public record ProductData(Long id, String name, BigDecimal price, Integer quantity) {

    public ProductData(Product product){
        this(product.getId(), product.getName(), product.getPrice(), product.getQuantity());
    }
}
