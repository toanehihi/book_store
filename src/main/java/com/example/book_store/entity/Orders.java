package com.example.book_store.entity;

import lombok.*;

import java.sql.Date;
import java.util.List;
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
    private int orderId;
    private Date innitDate;
    private String Address;
    private double transportCost;
    private double orderCost;
    private double total;
    private List<OrderDetails> orderDetails;
    private User user;
    private Payments payments;
    private Delivery delivery;
}
