package com.example.book_store.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import java.util.UUID;
import java.sql.Date;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="order")
public class Order {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name="uuid2",strategy="uuid2")
    @Column(columnDefinition="BINARY(16)")
    private UUID id;
    @Column(name="date_create")
    private Date dateCreate;
    @Column(name="address")
    private String address;
    @Column(name="transport_cost")
    private double transportCost;
    @Column(name="order_cost")
    private double orderCost;
    @Column(name="total")
    private double total;

    @ManyToOne(fetch = FetchType.EAGER,cascade = {
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH,
    })
    @JoinColumn(name="user_id")
    private User user;
    @ManyToOne(fetch = FetchType.LAZY,cascade = {
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH
    })
    @JoinColumn(name="payment_id")
    private Payment payment;
    @ManyToOne(fetch = FetchType.LAZY,cascade = {
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH
    })
    @JoinColumn(name="delivery_id")
    private Delivery delivery;
    @OneToMany(mappedBy = "order",fetch = FetchType.LAZY,cascade = {
            CascadeType.MERGE,
            CascadeType.DETACH,
            CascadeType.REFRESH,
            CascadeType.PERSIST
    })
    private List<OrderDetails> orderDetails;

}
