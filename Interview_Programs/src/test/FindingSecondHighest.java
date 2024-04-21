package test;

import java.util.Arrays;
import java.util.Comparator;

public class FindingSecondHighest {
	public static void main(String[] args) {
		int[] numbers = { 88, 7, 12, 54, 90, 87, 34 };
		Integer list = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(list);
	}

}
