package com.jotaveerrefe.product.manager.repository;

import com.jotaveerrefe.product.manager.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
