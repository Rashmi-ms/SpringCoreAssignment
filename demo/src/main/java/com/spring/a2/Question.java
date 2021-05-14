package com.spring.a2;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	private int questionId;
	private String questions;
	//private List<String> answers;
	//private Set<String> answers;
	private Map<Integer, String> answers;
	
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestions() {
		return questions;
	}
	public void setQuestions(String questions) {
		this.questions = questions;
	}
	public Map<Integer, String> getAnswers() {
		return answers;
	}
	public void setAnswers(Map<Integer, String> answers) {
		this.answers = answers;
	}
	/*public void displayInfo(){  
	    System.out.println(questionId+" "+questions);  
	    System.out.println("answers are:");  
	    Iterator<String> itr=answers.iterator();  
	    while(itr.hasNext()){  
	        System.out.println(itr.next());  
	    }*/  
	public void displayInfo(){  
	    System.out.println("question id:"+questionId);  
	    System.out.println("question name:"+questions);  
	    System.out.println("Answers....");  
	    Set<Entry<Integer, String>> set=answers.entrySet();  
	    Iterator<Entry<Integer, String>> itr=set.iterator();  
	    while(itr.hasNext()){  
	        Entry<Integer,String> entry=itr.next();  
	        System.out.println("Sequence number:"+entry.getKey()+" Answers:"+entry.getValue());  
	    }  
	}

	}

