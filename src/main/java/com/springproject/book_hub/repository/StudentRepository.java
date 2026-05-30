package com.springproject.book_hub.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.book_hub.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
