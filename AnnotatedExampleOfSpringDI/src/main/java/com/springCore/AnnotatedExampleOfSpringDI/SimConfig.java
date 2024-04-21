package com.springCore.AnnotatedExampleOfSpringDI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springCore.AnnotatedExampleOfSpringDI")
public class SimConfig {

	@Bean
	public Airtel airtel() {
		return new Airtel();
	}

	@Bean
	public Vodaphone vodaphone() {
		return new Vodaphone();
	}

}
