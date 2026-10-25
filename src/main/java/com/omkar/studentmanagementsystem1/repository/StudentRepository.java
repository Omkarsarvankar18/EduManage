package com.omkar.studentmanagementsystem1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omkar.studentmanagementsystem1.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}