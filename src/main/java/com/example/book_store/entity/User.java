package com.example.book_store.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.util.Lazy;

import java.util.List;
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private int userId;
    @Column(name="name")
    private String name;
    @Column(name="username",length=512)
    private String Username;
    @Column(name="password",length=512)
    private String Password;
    @Column(name="gender")
    private boolean Gender;
    @Column(name="email")
    private String Email;
    @Column(name="phone_number")
    private String PhoneNumber;
    @Column(name="address")
    private String Address;
    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY,cascade = {
            CascadeType.PERSIST,CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH
    })
    private List<Evaluate> evaluateList;
    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY,cascade = {
            CascadeType.PERSIST,CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH
    })
    private List<FavouriteBooks> favouriteBookList;
    @ManyToMany(fetch = FetchType.LAZY,cascade = {
            CascadeType.PERSIST,CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH
    })
    @JoinTable(
            name="user_role",
            joinColumns = @JoinColumn(name="user_id"),
            inverseJoinColumns = @JoinColumn(name="role_id")
    )
    private List<Role> role;
    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY,cascade = {
            CascadeType.PERSIST,CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH
    })
    private List<Orders> userOrders;


}
