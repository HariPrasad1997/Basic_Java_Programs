package com.harsha.java8.functionalInterface;

public class PhonePay implements TestFunctionalInterface {

	@Override
	public String doPayment(String source, String dest) {
		String datePattern = TestFunctionalInterface.datePattern("yyyy-mm-dd");
		return datePattern;
	}

}
