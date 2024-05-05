package com.example.book_store.entity;

import lombok.*;

import java.util.List;
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    private int roleId;
    private String Role;
    private List<User> userListRole;
}
