package com.project.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.demo.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
