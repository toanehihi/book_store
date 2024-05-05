package com.example.book_store.entity;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetails {
    private long orderDetailsId;
    private Book book;
    private int bookQuantity;
    private int bookPrice;
    private Orders orders;

}
