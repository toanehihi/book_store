package com.example.book_store.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;


import java.util.UUID;
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="order_details")
public class OrderDetails {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name="uuid2",strategy = "uuid2")
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;

    @Column(name="quantity")
    private int quantity;
    @Column(name="price")
    private double price;
    
    @ManyToOne(fetch = FetchType.LAZY,cascade = {
            CascadeType.MERGE,
            CascadeType.DETACH,
            CascadeType.PERSIST
    })
    @JoinColumn(name="book_id")
    private Book book;

    @ManyToOne(fetch = FetchType.LAZY,cascade ={
            CascadeType.MERGE,
            CascadeType.DETACH,
            CascadeType.PERSIST
    } )
    @JoinColumn(name="order_id")
    private Order orders;

}
