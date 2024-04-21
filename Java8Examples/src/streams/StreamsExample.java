package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Grapes", "PineApple");
		List<String> collect = fruits.stream().filter(a -> a.startsWith("A")).map(String::toLowerCase)
				.collect(Collectors.toList());
		System.out.println(collect);

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		long count = numbers.stream().count();
		System.out.println(count);

		int first = numbers.stream().findAny().orElse(null);
		System.out.println(first);

		List<Double> number = new ArrayList<>(Arrays.asList(1d, 2d, 3d, 4d, 5d, 6d, 7d, 8d));
		List<Double> num = number.stream().map(a -> a * a).collect(Collectors.toList());
		System.out.println(num);

		number.add(9d);
		System.out.println(number);
	}

}
