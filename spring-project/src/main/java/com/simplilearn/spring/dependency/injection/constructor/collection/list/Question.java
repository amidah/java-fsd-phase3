package com.simplilearn.spring.dependency.injection.constructor.collection.list;

import java.util.List;

public class Question {
	
	private int id;
	private String name;
	private List<Answer> answerList;
	
	public Question(int id, String name, List<Answer> answerList) {
		super();
		this.id = id;
		this.name = name;
		this.answerList = answerList;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", name=" + name + ", answerList=" + answerList + "]";
	}
	
	
	

}
