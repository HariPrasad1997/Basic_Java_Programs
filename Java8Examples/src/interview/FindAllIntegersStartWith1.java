package interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllIntegersStartWith1 {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(11, 18, 20, 24, 35, 66, 13);
		List<String> collect = numbers.stream().map(num -> num + "").filter(num -> num.startsWith("1"))
				.collect(Collectors.toList());
		System.out.println(collect);
	}

}
