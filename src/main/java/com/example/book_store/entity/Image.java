package com.example.book_store.entity;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Image {
    private int imageId;
    private String imageName;
    private boolean isIcon;
    private String imageLink;
    private String dataImage;
    private Book book;
}
