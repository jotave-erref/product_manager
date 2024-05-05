package com.jotaveerrefe.product.manager.domain.order;

import com.jotaveerrefe.product.manager.domain.product.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "order_item")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double discount;
    private Integer quantity;
    private BigDecimal price;
    @ManyToOne
    private Product product;
    @ManyToOne
    private Order order;
}
