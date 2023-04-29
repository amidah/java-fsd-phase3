package com.simplilearn.spring.spring_project;

public class Employee {

	private int id;
	private String name;
	
	public Employee() {
		System.out.println("Constructor Injection....");
	}

	public Employee(int id) {
		this.id = id;
	}

	public Employee(String name) {
		this.name = name;
	}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	void displayEmplyeeInfo() {
		System.out.println("Employee ID:: " + id);
		System.out.println("Employee Name:: " + name);
	}
	
}
