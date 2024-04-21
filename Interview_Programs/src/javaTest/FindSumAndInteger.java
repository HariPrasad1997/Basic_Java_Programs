package javaTest;

import java.util.Arrays;

public class FindSumAndInteger {
	public static void main(String[] args) {
		int[] numbers = { 12, 1, 2, 4, 7, 9, 35, 21, 45, 4 };
		int sum = Arrays.stream(numbers).sum();
		double average = Arrays.stream(numbers).average().getAsDouble();
		long countOfNumbers = Arrays.stream(numbers).count();
		System.out.println("Sum of numbers: " + sum);
		System.out.println("Average is : " + average);
		System.out.println("Count of numbers: " + countOfNumbers);
	}

}
