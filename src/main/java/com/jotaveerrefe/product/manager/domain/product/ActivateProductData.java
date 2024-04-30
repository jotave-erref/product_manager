package com.jotaveerrefe.product.manager.domain.product;

public record ActivateProductData(Long id, String name, Double price, Integer quantity, boolean ativo){

    public ActivateProductData(Product product){
        this(product.getId(), product.getName(), product.getPrice(), product.getQuantity(), product.isAtivo());
    }
}
