package java8Example;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedCharactersFromString {
	public static void main(String[] args) {
		String input = "gainjavaknowledge";
		Map<String, Long> collect = Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		System.out.println("count of each character: " + collect);

		// linkedhashMap : to follow the insertion order
		String collect2 = Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(x -> x.getValue() == 1).map(Map.Entry::getKey).findFirst().get();
		System.out.println("first non_repeated character: " + collect2);

		List<String> duplicateElement = Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(x -> x.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println("duplicate element: " + duplicateElement);
	}

}
