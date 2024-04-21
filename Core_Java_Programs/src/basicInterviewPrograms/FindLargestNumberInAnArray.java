package basicInterviewPrograms;

import java.util.Arrays;
import java.util.Collections;

public class FindLargestNumberInAnArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 7, 9, 12, 0, 4 };
		// Using array streams java8
		Integer sorted = Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).findFirst().get();
		System.out.println("Largest Element: " + sorted);

		// Using traditional java
		int largest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.println(largest);
	}

}
