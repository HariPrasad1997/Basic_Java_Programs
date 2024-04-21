package com.harsha.java8.functionalInterface;

import java.util.Comparator;
import java.util.concurrent.Callable;
import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) throws Exception {
		Predicate<String> predicate = a -> a.equals("Harsha".toLowerCase());
		System.out.println(predicate.test("harsha".toLowerCase()));

		Runnable runnable = () -> System.out.println("Run method..");
		runnable.run();

		Callable<Integer> callable = () -> 10 * 10;
		System.out.println(callable.call());

		Comparable<Integer> comparable = new Comparable<Integer>() {

			@Override
			public int compareTo(Integer o) {
				return 10;
			}
		};
		System.out.println(comparable.compareTo(10));

		Comparator<String> comparator = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return (o1.compareTo(o2));
			}
		};
		System.out.println(comparator.compare("Hari", "Harsha"));
	}

}
