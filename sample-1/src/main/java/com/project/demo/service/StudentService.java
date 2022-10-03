package com.project.demo.service;

import java.util.List;

import com.project.demo.entity.Student;

public interface StudentService {

	List<Student> getAll(); 
	Student getStudentById(int Id);
	void deleteById(int Id);
	
	void insertStudent(Student s);
	
	Student updateStudent(Student s);
	
	Student saveStudent(Student s);
}
