package java8Example;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestElement {
	public static void main(String[] args) {
		int[] numbers = { 5, 13, 41, 88, 99, 77 };
		/**
		 * 1. Convert numbers into stream 
		 * 2. Convert primitive data type into wrapper class using boxed method 
		 * 3. Sort the elements in descending order 
		 * 4. skip the first highest element i.e 99 
		 * 5. Find the first element after skipping by using findFirst element i.e 88
		 * 
		 */
		Integer secondHighest = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.get();
		System.out.println("Second Highest element: " + secondHighest);
	}

}
