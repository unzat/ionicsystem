package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "users")
@Data
public class User implements Serializable {
    private static final long serialVersionUID =1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_user;
    private String username;
    private String password;
    private String active;
    @ManyToOne
    @JoinColumn(name="id_profile", nullable = false, updatable = false)
    private Profile profile;

    /*public User(Long id_user, String username, String password, String active, Profile profile) {
        this.id_user = id_user;
        this.username = username;
        this.password = password;
        this.active = active;
        this.profile = profile;
    }*/
}
