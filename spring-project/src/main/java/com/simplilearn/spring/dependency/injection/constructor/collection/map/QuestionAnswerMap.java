package com.simplilearn.spring.dependency.injection.constructor.collection.map;

import java.util.Map;

public class QuestionAnswerMap {
	
 private int id;
 private Map<Question, Answer> quesAnsMap;
 
 public QuestionAnswerMap(int id, Map<Question, Answer> quesAnsMap) {
	super();
	this.id = id;
	this.quesAnsMap = quesAnsMap;
 }

@Override
public String toString() {
	return "QuestionAnswerMap [id=" + id + ", quesAnsMap=" + quesAnsMap + "]";
}
 
 
 
}
