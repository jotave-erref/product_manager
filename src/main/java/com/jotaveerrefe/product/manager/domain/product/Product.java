package com.jotaveerrefe.product.manager.domain.product;

import com.jotaveerrefe.product.manager.domain.category.Category;
import com.jotaveerrefe.product.manager.domain.order.OrderItem;
import com.jotaveerrefe.product.manager.domain.product.productDTO.ProductData;
import com.jotaveerrefe.product.manager.domain.product.productDTO.ProductRefreshData;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Product")
@Table(name = "products")
@EqualsAndHashCode(of = "id")
@Getter
@ToString
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private BigDecimal price;
    private Integer quantity;
    private boolean ativo;
    @OneToMany(mappedBy = "product")
    private List<OrderItem> itens;
    @ManyToMany
    @JoinTable(name = "category_product",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private List<Category> category = new ArrayList<>();

    public Product(){}

    public Product(ProductData data) {
        this.ativo = true;
        this.name = data.name();
        this.price = data.price();
        this.quantity = data.quantity();
    }


    public void refreshData(ProductRefreshData data){
        if(data.id() != null){
            this.id = data.id();
        }
        if(data.price() != null){
            this.price = data.price();
        }
        if(data.quantity() != null){
            this.quantity = data.quantity();
        }
    }

    public void addOrderItem(OrderItem item){
        this.itens.add(item);
    }
    public void logicalDelition(){
        this.ativo = false;
    }

    public void LogicalActivation() {
        this.ativo = true;
    }
}
