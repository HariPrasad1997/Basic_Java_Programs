package com.harsha.java8.functionalInterface;

import java.util.function.BiConsumer;

public class BiConsumerDemo implements BiConsumer<Integer, Integer> {
	public static void main(String[] args) {
		// Case 1
		BiConsumer<Integer, Integer> biConsumer = (n1, n2) -> System.out.println(n1 + n2);
		biConsumer.accept(34, 36);

		// Case 2
		BiConsumer<Integer, Integer> consumer = new BiConsumer<Integer, Integer>() {

			@Override
			public void accept(Integer t, Integer u) {
				System.out.println(t * u);

			}
		};

		consumer.accept(46, 34);

		// Case 3
		BiConsumer<Integer, Integer> consumer2 = new BiConsumerDemo();
		consumer2.accept(500, 400);
	}

	@Override
	public void accept(Integer t, Integer u) {
		System.out.println(t - u);

	}

}
