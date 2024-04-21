package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

interface Calculator {
	int add(int a, int b);
}

interface Car {
	void start();

	default void stop() {
		System.out.println("Car Stopped..");
	}
}

class Vehicle implements Car {

	@Override
	public void start() {
		System.out.println("Car started....");
	}

}

public class PrintingEvenNumbersUsingJava8 {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int evenNumbers = numbers.stream().filter(even -> even % 2 == 0).mapToInt(Integer::intValue).sum();
		System.out.println("Sum of EveneNumbers are: " + evenNumbers);

		numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList())
				.forEach(even -> System.out.print(even + " "));

//		Function<String, Integer> parseInt = Integer::parseInt;
//		StringJoiner joiner = new StringJoiner(",");
//		Consumer<String> addToJoiner = joiner::add;
//		System.out.println(addToJoiner);

		List<String> fruits = Arrays.asList("\napple", "banana", "orange");
		fruits.forEach(System.out::println);

		Calculator addition = (a, b) -> (a + b);
		System.out.println(addition.add(evenNumbers, evenNumbers));

		Vehicle vehicle = new Vehicle();
		vehicle.start();
		vehicle.stop();
	}

}
