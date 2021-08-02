package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestClass {
	
	  public static void main( String[] args )
	    {
	        System.out.println( "Hello World!" );
	        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
	        Question question = (Question) context.getBean("exam");
	        
	       
	        System.out.println(question.getQuestionId());
	        System.out.println(question.getQuestion());
	        System.out.println(question.getAnswer());
	    }

}
