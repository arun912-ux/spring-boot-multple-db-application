package com.example.multipledatabaseapp.db1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "product")
public class Product {

    @Id
    private Long id;
    private String name;
}
