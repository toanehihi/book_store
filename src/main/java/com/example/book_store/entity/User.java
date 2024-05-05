package com.example.book_store.entity;

import lombok.*;

import java.util.List;
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
    private List<Orders> userOrders;


}
