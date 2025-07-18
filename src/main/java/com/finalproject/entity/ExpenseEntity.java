package com.finalproject.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "expenses")
public class ExpenseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private Double amount;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    // getters and setters
}
