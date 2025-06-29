package com.example.multipledatabaseapp.db2.repo;

import com.example.multipledatabaseapp.db2.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Db2Repository extends JpaRepository<Student, String> {
}
