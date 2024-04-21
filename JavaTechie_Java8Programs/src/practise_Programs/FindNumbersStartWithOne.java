package practise_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNumbersStartWithOne {
	public static void main(String[] args) {
		int[] numbers = { 1, 31, 21, 34, 51, 17, 90, 87, 32, 16, 12 };
		List<String> startsWith1 = Arrays.stream(numbers).boxed().map(n -> n + " ").filter(x -> x.startsWith("1"))
				.collect(Collectors.toList());
		System.out.println(startsWith1);
	}

}
