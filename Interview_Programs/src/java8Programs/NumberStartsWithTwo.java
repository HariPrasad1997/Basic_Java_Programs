package java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartsWithTwo {
	public static void main(String[] args) {
		int[] numbers = { 13, 65, 43, 21, 78, 20, 54, 22 };
		List<String> collect = Arrays.stream(numbers).boxed().map(ele -> ele + "").filter(x -> x.startsWith("2"))
				.collect(Collectors.toList());
		System.out.println(collect);
	}

}
