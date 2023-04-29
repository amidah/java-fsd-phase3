package com.simplilearn.spring.dependency.injection.constructor.collection.map;



public class Question {
	private int id;
	private String name;
	
	public Question(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", name=" + name + "]";
	}
}
