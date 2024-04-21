package discussionsExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample {
	public static void main(String[] args) {

		int[] array = { 10, 12, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		var ascendingOrder = Arrays.stream(array).boxed().sorted().collect(Collectors.toList());
		System.out.println(ascendingOrder);

		var descendingOrder = Arrays.stream(array).boxed().sorted((a, b) -> b.compareTo(a))
				.collect(Collectors.toList());
		System.out.println(descendingOrder);

		// 1. List example
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 4, 3, 2, 5, 6, 7, 8, 9));
		var evenNumbers = numbers.stream().filter(a -> a % 2 != 0).collect(Collectors.toList());
		System.out.println(evenNumbers);

		numbers.add(10);
		numbers.add(0, 15);
		System.out.println(numbers);

		var map = numbers.stream().map(a -> a * 2).collect(Collectors.toList());
		System.out.println(map);

		var count = numbers.stream().count();
		System.out.println(count);

		var removeDuplicates = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(removeDuplicates);

		numbers.stream().forEach(result -> System.out.print(result + " "));

		System.out.println();
		var collect = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(collect);

		var collect2 = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(collect2);

		Map<Integer, String> map2 = new LinkedHashMap<>();
		map2.put(5, "Santhosh");
		map2.put(4, "nagaraju");
		map2.put(3, "hari");

		var sorted = map2.entrySet().stream().sorted((a, b) -> b.getKey()).filter(a -> a.getValue() != null)
				.collect(Collectors.toList());
		System.out.println(sorted);

	}

}
