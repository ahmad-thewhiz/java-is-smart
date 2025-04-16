package com.ahmad.SpringSecurity.Model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="Users")
public class User {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;
}
