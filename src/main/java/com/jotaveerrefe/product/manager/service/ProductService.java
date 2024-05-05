package com.jotaveerrefe.product.manager.service;

import com.jotaveerrefe.product.manager.domain.product.Product;
import com.jotaveerrefe.product.manager.domain.product.productDTO.ProductData;
import com.jotaveerrefe.product.manager.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;
    public void save(ProductData data){
        var product = new Product(data);
        repository.save(product);
    }
}
