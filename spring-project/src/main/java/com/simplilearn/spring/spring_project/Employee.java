package com.simplilearn.spring.spring_project;

public class Employee {

	private int id;
	private String name;
	private Address address;
	
	
	
	public Employee() {
		System.out.println("Constructor Injection....");
	}


	public Employee(int id, String name, Address address) {
		super();  
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	void displayEmployeeInfo() {
		System.out.println("Employee ID:: " + id);
		System.out.println("Employee Name:: " + name);
		System.out.println("Employee Address:: " + address);
	}
	
}
