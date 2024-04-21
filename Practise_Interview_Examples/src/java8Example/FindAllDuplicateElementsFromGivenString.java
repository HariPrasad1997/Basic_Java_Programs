package java8Example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Write a java program to find duplicate elements from the given String and
 * find unique elements from the given String
 * input : ilovemycountry
 * output1 : [y, o] duplicate elements
 * output2 : [r, c, t, u, e, v, i, l, m, n] unique elements
 * 
 * @author HariPrasad
 */

public class FindAllDuplicateElementsFromGivenString {
	public static void main(String[] args) {
		String input = "ilovemycountry";
		List<String> collect = Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(x -> x.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(collect);

		// find unique elements from the given String
		List<String> collect2 = Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(x -> x.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(collect2);
	}

}
