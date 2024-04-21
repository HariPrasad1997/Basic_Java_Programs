package array;

import java.util.Arrays;

public class AllEvenFirstAndOddLast {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		// o/p : 2,4,6,8,1,3,5,7,9
		isEvenFirstAndOddLast(arr);
	}

	private static void isEvenFirstAndOddLast(int[] arr) {

		int[] result = new int[arr.length]; // [0, 0, 0, 0, 0, 0, 0, 0, 0]

		int index = 0;
		// add the all even numbers to resultant array
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				result[index] = arr[i];
				index++;
			}
		}

		// add the all odd numbers to resultant array
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				result[index] = arr[i];
				index++;
			}
		}

		/*
		 * for (int i = 0; i < result.length; i++) { System.out.print(result[i] + " ");
		 * }
		 */

		for (int array : result) {
			System.out.print(array + " ");
		}
		System.out.println();
		int[] array = Arrays.stream(arr).boxed().sorted((a, b) -> Integer.compare(a % 2, b % 2))
				.mapToInt(Integer::intValue).toArray();
		for (int evnAnOdd : array) {
			System.out.print(evnAnOdd + " ");
		}
	}
}
