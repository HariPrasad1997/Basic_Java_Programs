package com.harsha.java8.functionalInterface;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
	public static void main(String[] args) {
		// Case : 1
		BiPredicate<Integer, Integer> biPredicate = (i1, i2) -> {
			if (i1.equals(i2)) {
				System.out.println(i1);
			} else {
				System.out.println(i1.compareTo(i2));
			}
			return i1.equals(i2);
		};
		biPredicate.test(180, 160);

		// Case : 2
		BiPredicate<String, String> predicate = (s1, s2) -> {
			if (s1.equalsIgnoreCase(s2)) {
				System.out.println("Both strings are same");
			} else if (!s1.equals(s2)) {
				System.out.println("Both strings content are different");
			} else if (s1 == s2) {
				System.out.println("something happens");
			}

			return (s1 + s2) != null;
		};
		predicate.test("HariPrasad", "Hari");

	}

}
