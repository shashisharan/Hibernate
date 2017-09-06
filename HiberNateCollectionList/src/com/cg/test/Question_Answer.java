package com.cg.test;

import java.util.List;

public class Question_Answer {
	
	
	private Integer id;
	
	private String Question;
	
	private List <String> answers;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		Question = question;
	}

	public List<String> getAnswers() {
		return answers;
	}

	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	
	
	
	

}
