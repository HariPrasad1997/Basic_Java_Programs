package com.harsha.java8.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExampleUsingStreams {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("a", "b", "c", "d");

		List<String> upperCase = new ArrayList<>();
		// Using for-each loop
		for (String alpha : list) {
			upperCase.add(alpha.toUpperCase());
		}
		System.out.println(list); // a, b, c, d
		System.out.println(upperCase); // A, B, C, D

		// Using streams map function
		var collect = list.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(collect);

		List<Integer> numbers = Arrays.asList(2, 4, 3, 1, 5);
		var collect2 = numbers.stream().map(x -> x * 2).collect(Collectors.toList());
		System.out.println(collect2);
	}

}
