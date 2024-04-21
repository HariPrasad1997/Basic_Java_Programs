package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNumbersStartWith1 {
	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 12, 45, 18, 20 };
		List<String> list = Arrays.stream(num).boxed().map(n -> n + "").filter(a -> a.startsWith("1"))
				.collect(Collectors.toList());
		System.out.println(list);
	}

}
