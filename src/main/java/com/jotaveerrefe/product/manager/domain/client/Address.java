package com.jotaveerrefe.product.manager.domain.client;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "Address")
@Table(name = "Adresses")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Getter
@ToString
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String publicPlace;
    private Integer mumber;
    private String addressDetail;
    private String neighborhood;
    private String zipCode;
    @ManyToOne
    private Client client;
}
