package com.harsha.java8.functionalInterface;

import java.util.function.BiFunction;

public class BiFunctionDemo {
//     implements BiFunction<Integer, Integer, Integer> {
	public static void main(String[] args) {
		// Case :1
//		BiFunction<Integer, Integer, Integer> biFunction = (e1, e2) -> {
//			return e1 + e2;
//
//		};
//
//		System.out.println(biFunction.apply(12, 15));

		// Case :2
//		BiFunction<Integer, Integer, Integer> biFunction = new BiFunctionDemo();
//		System.out.println(biFunction.apply(25, -25));
//		System.out.println(biFunction.apply(250, -25));

		// Case :3
		BiFunction<Integer, Integer, Integer> biFunctions = new BiFunction<Integer, Integer, Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				return t + u;
			}
		};
		System.out.println(biFunctions.apply(420, 480));
	}
	// case : 2
//	@Override
//	public Integer apply(Integer t, Integer u) {
//		return t + u;
//	}

}
