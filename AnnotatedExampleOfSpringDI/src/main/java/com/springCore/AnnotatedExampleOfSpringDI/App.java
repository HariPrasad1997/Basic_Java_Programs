package com.springCore.AnnotatedExampleOfSpringDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SimConfig.class);
		Sim sim = applicationContext.getBean("vodaphone", Sim.class);
		sim.calling();
		sim.data();

	}
}
