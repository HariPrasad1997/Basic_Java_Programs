package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class MessageController {
	
	@Value("${spring.message}")
	public String message;
	
	@GetMapping("/user/message")
	public String getMessage() {
		return message;
	}

}
