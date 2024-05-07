package com.example.book_store.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="order_id")
    private int orderId;
    @Column(name="init_date")
    private Date innitDate;
    @Column(name="address",length=512)
    private String Address;
    @Column(name="transport_cost")
    private double transportCost;
    @Column(name="order_cost")
    private double orderCost;
    @Column(name="total")
    private double total;
    @OneToMany(mappedBy = "orders",fetch = FetchType.LAZY,cascade = {
            CascadeType.ALL
    })
    private List<OrderDetails> orderDetails;
    @ManyToOne(cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH,CascadeType.REFRESH
    })
    @JoinColumn(name="user_id", nullable = false)
    private User user;
    @ManyToOne(cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name="payments")
    private Payments payments;
    @ManyToOne(cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name="delivery")
    private Delivery delivery;
}
