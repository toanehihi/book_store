package com.example.book_store.entity;

import java.util.List;
public class Book {
    private int bookId;
    private String bookName;
    private String bookAuthor;
    private String ISBN;
    private String bookDescription;
    private double bookListedPrice;
    private double bookSellPrice;
    private int bookQuantity;

    private List<Category> categoryList;
    private List<Image> imageList;
    private List<Evaluate> evaluateList;
    private List<CartDetails> cartList;
    private List<OrderDetails> orderList;
    private List<FavouriteBooks> favouriteBookList;

}
