package com.project.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.entity.Employee;
import com.project.demo.repository.EmployeeRepository;
import com.project.demo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmps() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmpById(int id) {
		
		return employeeRepository.getById(id);
	}

	@Override
	public Employee saveEmp(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee updateEmp(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmp(int id) {
		employeeRepository.deleteById(id);
	}

}
