package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "loyalty")
public class LoyaltyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "userID",unique = true,nullable = false)
    private Long userID;

    @Column(name = "loyalPoint",nullable = false)
    private int loyalPoint;
}
