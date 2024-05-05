package com.example.book_store.entity;

import lombok.*;

import java.util.List;
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Delivery {
    private int deliveryId;
    private String deliveryForm;
    private String des;
    private double cost;
    private List<Orders> orders;
}
