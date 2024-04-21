package test;

import java.util.Arrays;

public class FilterEvenFirstAndOddLast {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		isEvenAndOdd(arr);
		System.out.println();
		evenFirstAndOddNext(arr);
	}

	// using normal java approach
	private static void isEvenAndOdd(int[] arr) {
		int[] result = new int[arr.length];
		int index = 0;
		// adds all even first
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				result[index] = arr[i];
				index++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				result[index] = arr[i];
				index++;
			}
		}

		for (int array : result) {
			System.out.print(array + " ");
		}
	}

	// using java 8 approach
	private static void evenFirstAndOddNext(int[] arr) {
		int[] result = Arrays.stream(arr).boxed().sorted((a, b) -> Integer.compare(a % 2, b % 2))
				.mapToInt(Integer::intValue).toArray();
		for (int array : result) {
			System.out.print(array + " ");
		}
	}

}
