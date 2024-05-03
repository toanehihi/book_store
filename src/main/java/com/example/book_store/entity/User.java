package com.example.book_store.entity;

import java.util.List;
public class User {
    private int userId;
    private String name;
    private String Username;
    private String Password;
    private boolean Gender;
    private String Email;
    private String PhoneNumber;
    private String Address;
    private List<Evaluate> evaluateList;
    private List<FavouriteBooks> favouriteBookList;
    private List<Role> role;
    private List<Cart> userCart;
    private List<Orders> userOrders;

}
