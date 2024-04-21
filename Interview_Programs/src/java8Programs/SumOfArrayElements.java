package java8Programs;

import java.util.Arrays;

public class SumOfArrayElements {
	public static void main(String[] args) {
		int[] input = { 2, 3, 4, 5, 7 };
		long count = Arrays.stream(input).sum();
		System.out.println(count);
	}

}
