//package com.example.book_store.model;
//
//import jakarta.persistence.*;
//import lombok.*;
//import org.hibernate.annotations.GenericGenerator;
//import java.util.UUID;
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@Table(name="evaluate")
//public class Ranking {
//    @Id
//    @GeneratedValue(generator = "uuid2")
//    @GenericGenerator(name = "uuid2", strategy = "uuid2")
//    @Column(columnDefinition = "BINARY(16)")
//    private UUID id;
//    @Column(name="rank")
//    private float rank;
//
//    @ManyToOne()
//    private Book book;
//
//
//    private User user;
//
//}
