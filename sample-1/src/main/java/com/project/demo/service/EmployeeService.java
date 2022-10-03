package com.project.demo.service;

import java.util.List;

import com.project.demo.entity.Employee;

public interface EmployeeService {

	List<Employee> getAllEmps();
	Employee getEmpById(int id);
	Employee saveEmp(Employee employee);
	Employee updateEmp(Employee employee);
	void deleteEmp(int id);
}
