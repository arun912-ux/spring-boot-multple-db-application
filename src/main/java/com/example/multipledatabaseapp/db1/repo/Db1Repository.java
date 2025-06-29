package com.example.multipledatabaseapp.db1.repo;

import com.example.multipledatabaseapp.db1.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Db1Repository extends JpaRepository<Product, Long> {
}
