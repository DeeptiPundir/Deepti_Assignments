package com.Spring.Core.BeanLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class example {
	
	private String subject;

	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}

	public example() {
		super();
		// TODO Auto-generated constructor stub
	}

	public example(String subject) {
		super();
		this.subject = subject;
	}
	
	@PostConstruct
	public void start() {
		System.out.println("starting method..");
	}
	
	@PreDestroy
	public void end()
	{
		System.out.println("ending method..");
	}

}
