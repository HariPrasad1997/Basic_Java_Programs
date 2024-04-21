package practise_Programs;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestNumberInAnArray {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 4, 5, 7, 20, 3, 67, 90, 12, 56 };
		// second highest number
		Integer secondHighest = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.get();
		System.out.println("secondHighestNumber: " + secondHighest);

		// second lowest number
		Integer secondLowest = Arrays.stream(numbers).boxed().sorted().skip(1).findAny().get();
		System.out.println("secondLowest: " + secondLowest);
	}

}
