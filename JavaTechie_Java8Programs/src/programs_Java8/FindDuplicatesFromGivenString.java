package programs_Java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Program to find duplicates elements from the given string
 * 
 * @author HariPrasad
 */

public class FindDuplicatesFromGivenString {
	public static void main(String[] args) {
		String input = "ilovejava";
		// no of element occurance in given string
		Map<String, Long> elementOccurances = Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(elementOccurances);
		// Removing duplicate elements
		List<String> duplicateElements = elementOccurances.entrySet().stream().filter(x -> x.getValue() > 1)
				.map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(duplicateElements);

		// Filtering unique elements
		List<String> uniqueElements = elementOccurances.entrySet().stream().filter(x -> x.getValue() == 1)
				.map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(uniqueElements);

		// first non-repeat elements from given string
		String findFirst = Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey();
		System.out.println(findFirst);

		// find first repeated elements from given string

		String findFirstRepeated = Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(x -> x.getValue() > 1).findFirst().get().getKey();
		System.out.println(findFirstRepeated);
	}

}
