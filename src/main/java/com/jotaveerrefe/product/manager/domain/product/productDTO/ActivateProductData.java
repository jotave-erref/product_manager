package com.jotaveerrefe.product.manager.domain.product.productDTO;

import com.jotaveerrefe.product.manager.domain.product.Product;

import java.math.BigDecimal;

public record ActivateProductData(Long id, String name, BigDecimal price, Integer quantity, boolean ativo){

    public ActivateProductData(Product product){
        this(product.getId(), product.getName(), product.getPrice(), product.getQuantity(), product.isAtivo());
    }
}
