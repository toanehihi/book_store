package com.example.book_store.entity;
import lombok.*;

import java.util.List;
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Payments {
    private int paymentId;
    private String paymentForm;
    private String des;
    private double cost;
    private List<Orders> orders;
}
