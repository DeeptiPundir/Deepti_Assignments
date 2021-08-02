package com.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class mainClass {
	

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context= new ClassPathXmlApplicationContext("Config.xml");
        Customer cus = context.getBean("Customer",Customer.class);
        
        System.out.println(cus);
    }

}
