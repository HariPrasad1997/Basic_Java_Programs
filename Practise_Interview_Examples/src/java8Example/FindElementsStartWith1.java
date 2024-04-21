package java8Example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindElementsStartWith1 {
	public static void main(String[] args) {
		int[] numbers = { 1, 45, 64, 21, 32, 90, 19, 01, 120 };
		List<String> collect = Arrays.stream(numbers).boxed().map(n -> n + "").filter(x -> x.startsWith("1"))
				.collect(Collectors.toList());
		System.out.println(collect);
	}

}
