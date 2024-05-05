package com.example.book_store.entity;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Evaluate {
    private long evaluateId;
    private Book book;
    private float Rank;
    private String Comment;
    private User user;
}
