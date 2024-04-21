package com.harsha.java8.functionalInterface;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public interface TestFunctionalInterface {

	String doPayment(String source, String dest);

	default double getScratchCard() {
		return new Random().nextDouble();
	}

	static String datePattern(String pattern) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		return dateFormat.format(new Date());
	}

}
