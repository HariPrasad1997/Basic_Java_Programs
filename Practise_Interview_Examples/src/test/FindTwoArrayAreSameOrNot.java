package test;

import java.util.Arrays;

public class FindTwoArrayAreSameOrNot {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 1, 2, 5, 4 };
		if (isArraysEqual(arr1, arr2)) {
			System.out.println("Both arrays are same");
		} else {
			System.out.println("Both arrays are not same");
		}

	}

	// using normal java approach
	private static boolean isArraysEqual(int[] arr1, int[] arr2) {
		int l1 = arr1.length;
		int l2 = arr2.length;
		if (l1 != l2) {
			return false;
		} else {
			Arrays.sort(arr1);
			Arrays.sort(arr2);

			for (int i = 0; i < l1; i++) {
				if (arr1[i] != arr2[i]) {
					return false;
				}
			}
			return true;
		}
	}
}
