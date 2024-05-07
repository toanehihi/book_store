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
@Table(name="payments")
public class Payments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="payment_id")
    private int paymentId;
    @Column(name="payment_form")
    private String paymentForm;
    @Column(name="des")
    private String des;
    @Column(name="cost")
    private double cost;
    @OneToMany(mappedBy = "payments",cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
    })
    @JoinColumn(name="payment_id", nullable = false)
    private List<Orders> orders;
}
