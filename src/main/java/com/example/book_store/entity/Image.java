package com.example.book_store.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "image")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id")
    private int imageId;
    @Column(name = "image_name",length=256)
    private String imageName;
    @Column(name="is_icon")
    private boolean isIcon;
    @Column(name="image_url")
    private String imageUrl;
    @Column(name="image_data")
    @Lob
    private String imageData;
    @ManyToOne(cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
    })
    @JoinColumn(name="book_id", nullable = false)
    private Book book;
}
