package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "profiles")
@Data
public class Profile implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_profile;
    private String name;

    public Profile (Long id_profile){
        this.id_profile = id_profile;
    }

}
