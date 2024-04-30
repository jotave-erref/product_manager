package com.jotaveerrefe.product.manager.domain.product;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "Product")
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Getter
@ToString
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    private Integer quantity;
    private boolean ativo;

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

    public void logicalDelition(){
        this.ativo = false;
    }

    public void LogicalActivation() {
        this.ativo = true;
    }
}
