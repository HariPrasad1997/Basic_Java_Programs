package com.example.demo.serviceImpl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.demo.service.Pizza;

@Component
@Primary
public class Non_VegPizza implements Pizza {

	@Override
	public String getPizza() {
		return "Non-Veg Pizza";
	}

}
