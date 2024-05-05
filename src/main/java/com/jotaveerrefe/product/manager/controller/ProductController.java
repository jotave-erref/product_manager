package com.jotaveerrefe.product.manager.controller;

import com.jotaveerrefe.product.manager.domain.product.*;
import com.jotaveerrefe.product.manager.domain.product.productDTO.ActivateProductData;
import com.jotaveerrefe.product.manager.domain.product.productDTO.ProductData;
import com.jotaveerrefe.product.manager.domain.product.productDTO.ProductRefreshData;
import com.jotaveerrefe.product.manager.domain.product.productDTO.ProductRefreshDetail;
import com.jotaveerrefe.product.manager.repository.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity register(@RequestBody ProductData data, UriComponentsBuilder uriBuilder){
        var product = new Product(data);
        repository.save(product);
        var uri = uriBuilder.path("/products/{id}").buildAndExpand(product.getId()).toUri();
        return ResponseEntity.created(uri).body(new ProductData(product));
    }
    @GetMapping
    public ResponseEntity<Page<ProductData>> getAll(@PageableDefault(size = 10, page = 0, sort = {"name"}) Pageable pagination){
      var page = repository.findAll(pagination).map(ProductData::new);
        return ResponseEntity.ok(page);
    }
    @PutMapping
    @Transactional
    public ResponseEntity refresh(@RequestBody ProductRefreshData data){
        var id = repository.getReferenceById(data.id());
        id.refreshData(data);
        return ResponseEntity.ok(new ProductRefreshDetail(id));
    }

    @DeleteMapping("{id}")
    @Transactional
    public ResponseEntity logicalDelete(@PathVariable Long id){
        var p = repository.getReferenceById(id);
        p.logicalDelition();
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    @Transactional
    public ResponseEntity activeProduct(@PathVariable Long id){
        var p = repository.getReferenceById(id);
        p.LogicalActivation();
        return ResponseEntity.ok(new ActivateProductData(p));
    }


}
