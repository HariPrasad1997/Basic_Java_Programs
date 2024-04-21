package com.app.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
	
	// http://localhost:1998/helloWorld
	
	@GetMapping("/helloWorld")
	public String getHelloWorld() {
		return "Hello-HariPrasad!..Welcome to my first spring app";
	}
	

}
