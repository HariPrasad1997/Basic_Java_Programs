package com.springSecurity;

import org.springframework.web.bind.annotation.GetMapping;

public class HiController {

	@GetMapping("/hi")
	public String sayHi() {
		return "Hi  everyone";
	}

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello  everyone";
	}

}
