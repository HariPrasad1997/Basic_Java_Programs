package java8Features.functionalInterfaces;

import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		Function<Integer, Double> function = (a) -> Math.pow(a, 10);
		System.out.println(function.apply(2));
	}

}