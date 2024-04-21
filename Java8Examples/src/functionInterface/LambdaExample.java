package functionInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Hari", "Arya", "Chinna", "Madhu", "Charan");
		Collections.sort(names); // Ascending Order
		System.out.println(names);
		Collections.sort(names, Comparator.reverseOrder());
		System.out.println(names);

		// using stream API
		List<String> ascendingOrder = names.stream().sorted().collect(Collectors.toList());
		System.out.println(ascendingOrder);

		List<String> descendingOrder = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(descendingOrder);

		// Descending Order
		Collections.sort(names, (a, b) -> b.compareTo(a));
		System.out.println(names);
		
		
	}

}
