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

import com.project.demo.entity.Employee;
import com.project.demo.service.EmployeeService;

@RestController
@RequestMapping("/api/employee/")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("all")
	public ResponseEntity<List<Employee>> getAll(){
		return ResponseEntity.ok(employeeService.getAllEmps());
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Employee> getEmp(@PathVariable("id") int id){
		return new ResponseEntity<Employee>(employeeService.getEmpById(id), HttpStatus.OK);
	}
	
	@PostMapping("add")
	public ResponseEntity<Employee> saveEmp(@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.saveEmp(employee), HttpStatus.CREATED);
	}
	
	@PutMapping("update")
	public ResponseEntity<Employee> updateEmp(@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.updateEmp(employee), HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteEmp(@PathVariable("id") int id){
		employeeService.deleteEmp(id);
		return new ResponseEntity<String>("Employee deleted", HttpStatus.OK);
	}
}
