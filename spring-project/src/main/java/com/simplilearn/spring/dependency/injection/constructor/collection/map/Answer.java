package com.simplilearn.spring.dependency.injection.constructor.collection.map;

public class Answer {
	
	private int id;
	private String value;
	
	public Answer(int id, String value) {
		super();
		this.id = id;
		this.value = value;
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", value=" + value + "]";
	}
	
}
