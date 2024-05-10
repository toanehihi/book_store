package com.example.book_store.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;
import java.util.UUID;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="delivery")
public class Delivery {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name="uuid2",strategy="uuid2")
    @Column(columnDefinition="BINARY(16)")
    private UUID id;
    @Column(name="method")
    private String method;
    @Column(name="description")
    private String description;
    @Column(name="cost")
    private double cost;

    @OneToMany(mappedBy = "delivery",fetch = FetchType.EAGER,cascade = {
            CascadeType.PERSIST,
            CascadeType.REFRESH,
            CascadeType.MERGE
    })
    private List<Order> orders;
}
