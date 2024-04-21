package com.harsha.java8.find;

import java.util.Arrays;
import java.util.List;

public class FindElementsExample {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12, 3, 2, 32, 14, 35);
		var findFirst = numbers.stream().findFirst();
		if (!findFirst.isEmpty() && findFirst.isPresent()) {
			System.out.println(findFirst.get());
		} else {
			System.out.println("elements are not present");
		}

		var findAny = numbers.stream().findAny();
		if (!findAny.isEmpty() && findAny.isPresent()) {
			System.out.println(findAny.get());
		} else {
			System.out.println("elements not found");
		}
	}

}
