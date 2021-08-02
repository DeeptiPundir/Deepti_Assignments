package com.springrest1.restassign1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloMessageController {
	
	
	@GetMapping("/hello")
	public String displayMessage()
	{
		HelloMessage ob = new HelloMessage();
		return ob.sayHello();
		
	}

}
