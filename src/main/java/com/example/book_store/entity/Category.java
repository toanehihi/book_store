package com.example.book_store.entity;

import lombok.*;

import java.util.List;
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    private int categoryId;
    private String categoryName;
    private List<Book> listBook;
}
