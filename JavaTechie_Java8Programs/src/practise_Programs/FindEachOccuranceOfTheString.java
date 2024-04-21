package practise_Programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindEachOccuranceOfTheString {
	public static void main(String[] args) {
		String s = "ilovemymother";
		// Find occurrence of the each element from the given string
		Map<String, Long> occurance = Arrays.stream(s.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		System.out.println(occurance);

		// Program to find all duplicate elements from string
		List<String> duplicateStrings = Arrays.stream(s.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(x -> x.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(duplicateStrings);

		// Program to find first non repeat elements
		List<String> first_non_repeat_Elements = occurance.entrySet().stream().filter(x -> x.getValue() == 1)
				.map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(first_non_repeat_Elements);

		Map<String, Long> oc = Arrays.stream(s.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(oc);
		List<String> list = oc.entrySet().stream().filter(p -> p.getValue() > 1).map(Map.Entry::getKey)
				.collect(Collectors.toList());
		System.out.println(list);
		
		
	}

}
