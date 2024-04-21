package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.controller.PizzaController;
import com.example.demo.service.Pizza;
import com.example.demo.serviceImpl.VegPizza;

@SpringBootApplication
public class SpringAnnotationsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringAnnotationsApplication.class, args);
		PizzaController controller = (PizzaController) context.getBean("pizzaController", PizzaController.class);
		System.out.println(controller.getPizza());
	}

}
