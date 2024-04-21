package javaTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindSecondSmallestNumber {
	public static void main(String[] args) {
		int[] numbers = { 12, 32, 14, 23, 10, 43, 56, 75, 8 };
		// using java8 approach // ascending order
		List<Integer> sorted = Arrays.stream(numbers).boxed().sorted().collect(Collectors.toList());
		System.out.println(sorted);

		// Descending order
		List<Integer> descendingOrder = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(descendingOrder);

		// second highest
		Integer secondHighest = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.get();
		System.out.println("secondHighest: " + secondHighest);

		// second Smallest
		Integer secondSmallest = Arrays.stream(numbers).boxed().sorted(Comparator.naturalOrder()).skip(1).findFirst()
				.get();
		System.out.println("secondSmallest: " + secondSmallest);

		// using regular approach
		maxLength(numbers);
		findSecondHighest(numbers);
		findSecondSmallest(numbers);

	}

	private static void maxLength(int[] num) {
		int maxvalue = num[0];
		int minValue = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] > maxvalue) {
				maxvalue = num[i];
			}

			else {
				minValue = num[i];
			}
		}
		System.out.println("Maximum Value is : " + maxvalue);
		System.out.println("Minim Value is : " + minValue);
	}

	private static int findSecondHighest(int[] num) {
		int size = num.length; // 9
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.println("Second Highest: " + num[size - 2]);
		return num[size - 2];
	}

	private static int findSecondSmallest(int[] num) {
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] < num[j]) {
					int secondSmallest = num[i];
					num[i] = num[j];
					num[j] = secondSmallest;
				}
			}
		}
		System.out.println("second smallest :" + num[num.length - 2]);
		return num[num.length - 2];
	}

}
