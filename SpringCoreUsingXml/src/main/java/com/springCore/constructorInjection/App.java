package com.springCore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("sim.xml");
		Sim type = context.getBean("airtel", Airtel.class);
		System.out.println(type.toString());
		type.cost();
		type.type();
	}

}
