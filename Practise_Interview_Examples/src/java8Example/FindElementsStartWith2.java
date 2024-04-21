package java8Example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindElementsStartWith2 {
	public static void main(String[] args) {
		int[] numbers = { 34, 57, 28, 99, 21, 10, 52 };
		/*
		 * 1. Convert array of numbers into stream 2. convert the primitive data type
		 * into wrapper class 3. add the "" for each number of the array elemt 4. filter
		 * the elements based on the index start with 2 5. collect the all the elements
		 * then store it in one variable
		 */
		List<String> collect = Arrays.stream(numbers).boxed().map(num -> num + "").filter(x -> x.startsWith("2"))
				.collect(Collectors.toList());
		System.out.println("output: "+collect);
	}

}
