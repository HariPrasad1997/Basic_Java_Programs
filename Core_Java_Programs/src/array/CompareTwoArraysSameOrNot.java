package array;

import java.util.Arrays;

public class CompareTwoArraysSameOrNot {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 1, 2, 3, 4, 5, 6 };
		if (isEqual(arr1, arr2)) {
			System.out.println("Both are equal");
		} else {
			System.out.println("both are not equal");
		}

	}

	private static boolean isEqual(int[] arr1, int[] arr2) {
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
