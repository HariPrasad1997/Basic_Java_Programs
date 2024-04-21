package com.springCore.AnnotatedExampleOfSpringDI;

//@Component
public class Vodaphone implements Sim {

	public void calling() {
		System.out.println("Calling using vodaphone sim");

	}

	public void data() {
		System.out.println("Browsing internet using vodaphone sim");

	}

}
