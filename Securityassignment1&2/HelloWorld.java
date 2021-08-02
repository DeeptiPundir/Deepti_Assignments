package com.spring.security.Securityassignment1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@GetMapping("/")
	public String sayHello()
	{
		return "Welcome to Hello World page";
	}
	
	@GetMapping("/admin")
	public String admin()
	{
		return "Welcome admin to Hello World page";
	}

}
