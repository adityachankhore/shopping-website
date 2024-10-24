package com.shoppingbackend.shopping.website.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Laptop {
    @Id
    int id;
    String laptopName;
    @ManyToOne
    Student user;
}
