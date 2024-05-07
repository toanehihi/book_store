package com.example.book_store.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="role_id")
    private int roleId;
    @Column(name="role")
    private String Role;
    @ManyToMany(fetch = FetchType.LAZY,cascade = {
            CascadeType.PERSIST,CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH
    })
    @JoinTable(name="user_role",
    joinColumns = @JoinColumn(name="role_id"),inverseJoinColumns = @JoinColumn(name="user_id")  )
    private List<User> userListRole;
}
