package com.example.book_store.entity;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FavouriteBooks {
    private int Id;
    private User user;
    private Book book;
}
