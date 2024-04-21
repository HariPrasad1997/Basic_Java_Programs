package com.example.demo.serviceImpl;

import org.springframework.stereotype.Component;

import com.example.demo.service.Pizza;

@Component
public class VegPizza implements Pizza {

	@Override
	public String getPizza() {
		return "Veg-Pizza!";
	}

}
