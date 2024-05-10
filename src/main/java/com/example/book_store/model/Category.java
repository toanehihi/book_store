package com.example.book_store.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import java.util.UUID;
import java.util.List;
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="category")
public class Category {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;
    @Column(name="name")
    private String name;

    @ManyToMany(fetch = FetchType.LAZY,cascade = {
            CascadeType.MERGE,
            CascadeType.DETACH,
            CascadeType.PERSIST
    })
    @JoinTable(
            name="book_category_relationship",
            joinColumns = @JoinColumn(name="category_id"),
            inverseJoinColumns = @JoinColumn(name="book_id")
    )
    private List<Book> books;
}
