package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.service.Pizza;

@Component
public class PizzaController {

	private Pizza pizza;

	@Autowired
	public PizzaController(Pizza pizza) {
		this.pizza = pizza;
	}

	public String getPizza() {
		return pizza.getPizza();
	}

}
