package com.springrest.restassignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springrest.restassignment5.entities.Employee;
import com.springrest.restassignment5.jdbc.EmployeeDao;

@SpringBootApplication
public class RestAssignment5Application implements CommandLineRunner{

	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	EmployeeDao dao;
	
	public static void main(String[] args) {
		SpringApplication.run(RestAssignment5Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		logger.info("All employees -> {}",dao.findAll());
		logger.info("Inserting an employee in Employee table ->{}",
				dao.insert(new Employee(104,"CHANDLER","DATA MANAGEMENT","DATA PROCESSOR",15000)));
		
		logger.info("employees 103 -> {}",dao.findById(103));
		logger.info("delete employees 102 -> {}",dao.findById(102));
		
	}


}
