package com.example.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	// URL: http://localhost:2024/hello

	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World!..";
	}

}
