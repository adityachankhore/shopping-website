package com.shoppingbackend.shopping.website.model;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
public class Student {
    @Id
    int id ;
    String name;
    String course;

    @OneToMany(mappedBy = "user")
    ArrayList<Laptop> laptop;
}
