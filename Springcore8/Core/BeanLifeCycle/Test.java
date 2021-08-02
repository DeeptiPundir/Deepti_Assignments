package com.Spring.Core.BeanLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args)
	{
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("congif.xml");
		
		//registering shut down hook
		context.registerShutdownHook();  //this will first run destroy method 
		example example=(example)context.getBean("e1");
		System.out.println(example);
	}

}
