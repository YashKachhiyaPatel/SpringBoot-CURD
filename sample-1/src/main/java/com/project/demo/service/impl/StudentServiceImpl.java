package com.project.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.entity.Student;
import com.project.demo.repository.StudentRepository;
import com.project.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getAll() {
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(int Id) {
		
		return studentRepository.getById(Id);
	}

	@Override
	public void deleteById(int Id) {
		try {
			studentRepository.deleteById(Id);
		}catch (Exception e) {
			System.out.print("Error "+e.getMessage());
		}
		
	}

	@Override
	public void insertStudent(Student s) {
		studentRepository.save(s);
	}

	@Override
	public Student updateStudent(Student s) {
//		Student stu = studentRepository.findById(Id).get();
//		stu.setName(s.getName());
//		stu.setAddress(s.getAddress());
//		return stu;
		return studentRepository.save(s);
	}

	@Override
	public Student saveStudent(Student s) {
		
		return studentRepository.save(s);
	}

}
