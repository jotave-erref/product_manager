package com.jotaveerrefe.product.manager.domain.order;

import com.jotaveerrefe.product.manager.domain.client.Client;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "Order")
@Table(name = "orders")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Getter
@ToString
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime instant = LocalDateTime.now();
    @ManyToOne
    private Client client;
    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItem;


}
