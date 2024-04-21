package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Write a program to print duplicates by using stream API
 * 
 * @author hkathi
 *
 */

public class FindingDuplicatesInAnArrayUsingStreams {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 3, 2, 1, 5, 8, 20 };
		findDuplicates(arr);

		List<Integer> list = new ArrayList<>();
		Collections.addAll(list, 1, 2, 3, 4, 2, 4, 5, 1);
		Set<Integer> set = new HashSet<>();
		list.stream().filter(x -> !set.add(x)).collect(Collectors.toList())
				.forEach(duplicateValues -> System.out.print(duplicateValues + " "));
	}

	public static void findDuplicates(int[] arr) {
		Set<Integer> numbers = new HashSet<>();
		for (int num : arr) {
			if (!numbers.add(num)) {
				System.out.println("Duplicate element: " + num);
			}
		}

	}

}
