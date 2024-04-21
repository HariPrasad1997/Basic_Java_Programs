package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a java program to add the sum with each individual element input:
 * 10,20,30,40,50,60 sum : 210 + 10,210+ 20 etc... output:
 * 220,230,240,250,260,270
 */

public class AddSumOfTheArrayElements {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60);
		Integer sum = numbers.stream().reduce(0, Integer::sum);
		List<Integer> addition = numbers.stream().map(add -> add + sum).collect(Collectors.toList());
		System.out.println(addition);

	}

}
