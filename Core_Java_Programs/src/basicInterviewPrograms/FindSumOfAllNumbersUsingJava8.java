package basicInterviewPrograms;

import java.util.stream.IntStream;

public class FindSumOfAllNumbersUsingJava8 {
	public static void main(String[] args) {
		int number = 12345;
		IntStream sum = String.valueOf(number).chars();
		int sum2 = sum.map(Character::getNumericValue).sum();
		System.out.println(sum2);
	}

}
