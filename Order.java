package com.example.qrmenu.entities;

import jakarta.persistence.*;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customerName;
    private String items;
    private double total;

    // Getters and Setters
}
