package com.example.book_store.entity;

import jakarta.persistence.*;
import lombok.*;

import org.springframework.data.annotation.Id;

import java.util.List;
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private int bookId;
    @Column(name = "book_name",length=256)
    private String bookName;
    @Column(name = "book_author",length=256)
    private String bookAuthor;
    @Column(name = "isbn",length=256)
    private String ISBN;
    @Column(name="book_description",columnDefinition = "text")
    private String bookDescription;
    @Column(name="book_original_price")
    private double bookOriginalPrice;
    @Column(name="book_sell_price")
    private double bookSellPrice;
    @Column(name="quantity")
    private int bookQuantity;
    @Column(name="average_rank")
    private Double averageRank;
    @ManyToMany(fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
    })
    @JoinTable(
            name="book_categorylist",
            joinColumns = @JoinColumn(name="book_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private List<Category> categoryList;

    private List<Image> imageList;
    private List<Evaluate> evaluateList;
    private List<OrderDetails> orderList;
    private List<FavouriteBooks> favouriteBookList;

}
