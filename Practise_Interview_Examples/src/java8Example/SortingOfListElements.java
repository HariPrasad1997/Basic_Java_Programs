package java8Example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingOfListElements {
	public static void main(String[] args) {
		List<String> input = Arrays.asList("hari", "ravi", "arjun", "arya", "siva", "raghu");
		List<String> ascendingOrder = input.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(ascendingOrder);

		List<String> descendingOrder = input.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(descendingOrder);

		input.sort(String.CASE_INSENSITIVE_ORDER);
		System.out.println(input);
	}

}
