package com.jotaveerrefe.product.manager.domain.category;

import com.jotaveerrefe.product.manager.domain.product.Product;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "Category")
@Table(name = "categories")
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @ManyToMany()
    private List<Product> products = new ArrayList<>();
}
