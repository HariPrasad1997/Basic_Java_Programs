package programs_Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Find elements from array whose start with 1
 * 
 * @author HariPrasad
 */

public class FindElementsStartWith1 {
	public static void main(String[] args) {
		int[] numbers = { 5, 9, 11, 2, 8, 19, 1, 21 };
		List<String> collect = Arrays.stream(numbers).boxed().map(s -> s + "").filter(x -> x.startsWith("1"))
				.collect(Collectors.toList());
		System.out.println(collect);
	}

}
