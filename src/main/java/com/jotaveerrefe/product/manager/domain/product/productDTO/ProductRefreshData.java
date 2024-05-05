package com.jotaveerrefe.product.manager.domain.product.productDTO;

import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ProductRefreshData(
        @NotNull
        Long id,
        BigDecimal price,
        Integer quantity){
}
