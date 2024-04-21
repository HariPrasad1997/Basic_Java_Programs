package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicates {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Demo", "", "Filter", "Circle", "", "Remo");
		Predicate<String> nonEmpty = String::isEmpty;

		List<String> collect = words.stream().filter(nonEmpty.negate()).collect(Collectors.toList());
		System.out.println(collect);
	}

}
