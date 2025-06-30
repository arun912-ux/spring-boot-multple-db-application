package com.example.multipledatabaseapp.db2.repo;

import com.example.multipledatabaseapp.db2.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SomeOtherRepo extends JpaRepository<Student, Integer> {
}
