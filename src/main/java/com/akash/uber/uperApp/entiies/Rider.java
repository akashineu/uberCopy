package com.akash.uber.uperApp.entiies;

import jakarta.persistence.*;

@Entity
public class Rider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double ratting;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
