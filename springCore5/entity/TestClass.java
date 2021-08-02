package com.springCore.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		 
	    Employee emp = ac.getBean("FelulaGeller", Employee.class);
	    System.out.println(emp.toString());
	}

}

