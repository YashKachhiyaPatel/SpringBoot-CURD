package com.project.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

	@javax.persistence.Id
	@GeneratedValue
	int Id;
	
	@Column
	String name;
	
	@Column
	String address;

	
	public Student() {
		
	}
	
	
	public Student(int id, String name, String address) {
		super();
		Id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
