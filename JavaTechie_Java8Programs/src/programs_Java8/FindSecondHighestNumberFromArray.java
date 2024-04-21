package programs_Java8;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondHighestNumberFromArray {
	public static void main(String[] args) {
		int[] numbers = { 5, 9, 11, 2, 8, 21, 1 };
		Integer secondHighestElement = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1)
				.findFirst().get();
		System.out.println(secondHighestElement);

		// second lowest number
		Integer secondLowest = Arrays.stream(numbers).boxed().sorted().skip(1).findFirst().get();
		System.out.println(secondLowest);
	}

}
