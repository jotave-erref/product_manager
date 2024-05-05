package com.jotaveerrefe.product.manager.domain.client;

import com.jotaveerrefe.product.manager.domain.order.Order;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "Client")
@Table(name = "clients")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Getter
@ToString
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String cpfOrCnpj;
    @OneToMany(mappedBy = "client")
    private List<Address> adress = new ArrayList<>();
    @OneToMany(mappedBy = "client")
    private List<Order> orders = new ArrayList<>();
}
