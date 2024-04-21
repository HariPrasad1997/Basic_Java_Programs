package java8Example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicsOfJava8Methods {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 12, 13, 14, 26, 27);

		// 1. Filtering data : Even Numbers
		List<Integer> evenNumbers = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println("Even_Numbers: " + evenNumbers);
		// Odd Numbers
		List<Integer> oddNumbers = numbers.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
		System.out.println("Odd_Numbers: " + oddNumbers);

		// 2. Mapping data
		List<Integer> doubleValue = numbers.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println(doubleValue);
		// convert names into upper case
		String[] input = { "Chinna", "Kanna", "Anna" };
		List<String> collect = Arrays.stream(input).map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(collect);

		// 3. Finding Data
		List<String> strings = Arrays.asList("Arya", "Harsha", "Ravi", "Arjun");
		String string = strings.stream().filter(x -> x.startsWith("A")).findFirst().get();
		System.out.println(string);

		// 4. Sorting data :: Descending Order
		List<Integer> descendingOrder = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(descendingOrder);

		// AscendingOrder
		List<Integer> ascendingOrder = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(ascendingOrder);

		// 5. Reducing Data // finding sum
		Integer sum = numbers.stream().reduce(0, Integer::sum);
		System.out.println("sum of numbers: " + sum);

		// Finding longest string from given list of strings
		String longestString = strings.stream().reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2).get();
		System.out.println("longestString: " + longestString);

		// 6. Grouping data / group by remainder when divided by 3
		Map<Integer, List<Integer>> groupingBy = numbers.stream().collect(Collectors.groupingBy(n -> n % 3));
		System.out.println(groupingBy);

		// 7. Transforming Data // create a map with number as key and value as "Number:
		// <number>"
		Map<Integer, String> collect2 = numbers.stream().collect(Collectors.toMap(n -> n, n -> "Number: " + n));
		System.out.println(collect2);

		// 8. Combining Data // combine two lists and remove duplicates
		List<Integer> collect3 = Stream.concat(numbers.stream(), Arrays.asList(11, 21, 13).stream()).distinct()
				.collect(Collectors.toList());
		System.out.println(collect3);

		// 9. Parallel Processing // parallel stream
		long count = numbers.parallelStream().filter(n -> n % 2 == 0).count();
		System.out.println(count);

		// 10. Handling Null Values:
		String name = null;
		Optional<String> ofNullable = Optional.ofNullable(name);
		System.out.println(ofNullable.orElse("Default name"));

	}

}
