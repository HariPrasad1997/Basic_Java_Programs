package test;

import java.util.Arrays;
import java.util.Comparator;

public class FindLargeNumberInAnArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 12, 9, 13, -1 };
		Object[] result = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).toArray();
		System.out.println(result[0]);
	}

}
