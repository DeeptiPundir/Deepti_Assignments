package com.spring.core;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
	
	int questionId;
	String question;
//	List<String> answer;
//	Set<String> answer;
	Map<Integer,String> answer;
	
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/* using list
	 
	public Question(int questionId, String question, List<String> answer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer = answer;
	*/
	
	
/*	using set
	
	public Question(int questionId, String question, Set<String> answer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer = answer;
	}

*/
	
	


	public int getQuestionId() {
		return questionId;
	}
	public Question(int questionId, String question, Map<Integer, String> answer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer = answer;
	}


	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
/* using list
 	

	public List<String> getAnswer() {
		return answer;
	}
	
	public void setAnswer(List<String> answer) {
		this.answer = answer;
	}
*/

	/* using set
	public Set<String> getAnswer() {
		return answer;
	}




	public void setAnswer(Set<String> answer) {
		this.answer = answer;
	}

*/
	


	public Map<Integer, String> getAnswer() {
		return answer;
	}


	public void setAnswer(Map<Integer, String> answer) {
		this.answer = answer;
	}


	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question + ", answer=" + answer + "]";
	}
	


	

	
	

}
