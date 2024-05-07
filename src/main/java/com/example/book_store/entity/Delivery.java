package com.example.book_store.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="delivery")
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="delivery_id")
    private int deliveryId;
    @Column(name="delivery_form")
    private String deliveryForm;
    @Column(name="des")
    private String des;
    @Column(name="cost")
    private double cost;
    @OneToMany(mappedBy = "delivery",cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
    })
    @JoinColumn(name="delivery", nullable = false)
    private List<Orders> orders;
}
