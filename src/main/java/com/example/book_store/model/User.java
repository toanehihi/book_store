package com.example.book_store.model;

import com.example.book_store.common.Role;
import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;
import java.util.List;
import org.hibernate.annotations.GenericGenerator;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
    @Column(name="address")
    private String address;

    @Column(name="role")
    @Enumerated(EnumType.STRING)
    private Role role;


    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY,cascade = {
            CascadeType.ALL
    })
    private List<FavouriteBooks> favouriteBooks;

    @OneToMany(mappedBy = "user",fetch = FetchType.EAGER,cascade = {
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.DETACH,
            CascadeType.REFRESH
    })
    private List<Order> userOrders;
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = {
            CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH
    })
    private List<Comment> comments;

}
