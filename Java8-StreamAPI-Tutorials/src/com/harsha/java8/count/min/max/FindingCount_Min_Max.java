package com.harsha.java8.count.min.max;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindingCount_Min_Max {
	public static void main(String[] args) {

		// finding count using stream
		List<Integer> count = Arrays.asList(1, 2, 3, 4, 5, 67, 7, 8, 9, 10,-1);
		System.out.println(count.stream().count());

		// finding minimum element from stream
		Integer min = count.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(min);

		// finding Maximum element from list
		Integer max = count.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(max);

	}
}
