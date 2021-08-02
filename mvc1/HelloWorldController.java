package com.assignments.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {
	
	@RequestMapping(value = "/login" , method = RequestMethod.GET)
	public String sayHello() {
		return "index";
	}
	
	@RequestMapping(value = "/welcome" , method = RequestMethod.GET)
	public String printHelloWorld() {
		
		return "HelloPage";
	}
		

}
