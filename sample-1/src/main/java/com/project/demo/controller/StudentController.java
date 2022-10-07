package com.project.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.entity.Student;
import com.project.demo.service.StudentService;

@RestController
@RequestMapping("api/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Student>> getAll(){
		return ResponseEntity.ok(studentService.getAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Student> getById(@PathVariable("id") int id){
		return new ResponseEntity<Student>(studentService.getStudentById(id), HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student){
		return new ResponseEntity<Student>(studentService.saveStudent(student), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable("id") int id) {
		studentService.deleteById(id);
		System.out.println("student delete mapping.");
		return new ResponseEntity<String>("deleted student", HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Student> updateStudent( @RequestBody Student student) {
		return new ResponseEntity<Student>(studentService.updateStudent(student), HttpStatus.OK);
	}
	
}
