package com.harsha.java8.functionalInterface;

public class Paytm implements TestFunctionalInterface {

	@Override
	public String doPayment(String source, String dest) {
		String datePattern = TestFunctionalInterface.datePattern("yyyy-MM-dd");
		return datePattern;
	}

	@Override
	public double getScratchCard() {
		// TODO Auto-generated method stub
		return TestFunctionalInterface.super.getScratchCard();
	}

}
