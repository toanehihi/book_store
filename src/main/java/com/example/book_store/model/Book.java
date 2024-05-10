package com.example.book_store.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import org.hibernate.annotations.GenericGenerator;


import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="book")
public class Book {
    //
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;
    //
    @Column(name="name")
    private String name;
    //
    @Column(name="author")
    private String author;
    //
    @Column(name="description")
    private String description;
    //
    @Column(name="price")
    private double price;
    //
    @Column(name="quantity")
    private int quantity;
    //IMAGE
    @OneToMany(mappedBy = "book",fetch = FetchType.LAZY,cascade = {
            CascadeType.ALL
    })
    private List<Image> images;

    //Category
    @ManyToMany(fetch = FetchType.LAZY,cascade = {
            CascadeType.MERGE,
            CascadeType.DETACH,
            CascadeType.PERSIST
    })
    @JoinTable(
            name="book_category_relationship",
            joinColumns = @JoinColumn(name="book_id"),
            inverseJoinColumns = @JoinColumn(name="category_id")
    )
    private List<Category> categories;
    //Comment
    @OneToMany(mappedBy = "book",fetch = FetchType.LAZY,cascade = {
            CascadeType.ALL
    })
    private List<Comment> comments;
    //orderDetails
    @OneToMany(mappedBy = "book",fetch = FetchType.LAZY,cascade = {
            CascadeType.MERGE,
            CascadeType.DETACH,
            CascadeType.PERSIST
    })
    private List<OrderDetails> orderDetails;
    //favourite
    @OneToMany(mappedBy = "book",fetch = FetchType.LAZY,cascade = {
            CascadeType.MERGE,
            CascadeType.DETACH,
            CascadeType.PERSIST
    })
    private List<FavouriteBooks> favouriteBook;

}
