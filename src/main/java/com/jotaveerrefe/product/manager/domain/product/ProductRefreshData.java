package com.jotaveerrefe.product.manager.domain.product;

import jakarta.validation.constraints.NotNull;

public record ProductRefreshData(
        @NotNull
        Long id,
        Double price,
        Integer quantity){
}
