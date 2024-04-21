package javaTest;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Write a program to find duplicate elements from an array.
 * 
 */

public class FindDuplicatesFromAnArray {
	public static void main(String[] args) {
		int[] numbers = { 21, 12, 23, 45, 54, 32, 23, 12, 87, 21 };

		Set<Integer> non_Duplicates = new LinkedHashSet<>();
		Set<Integer> duplicates = new LinkedHashSet<>();
		// Regular approach
		for (Integer integer : numbers) {
			if (!non_Duplicates.contains(integer)) {
				non_Duplicates.add(integer);
			} else {
				duplicates.add(integer);
			}
		}
		System.out.println("Non Duplicates : " + non_Duplicates);
		System.out.println("Duplicates : " + duplicates);

		// Using java-8 approach
		List<Integer> withoutDuplicates = Arrays.stream(numbers).boxed().distinct().collect(Collectors.toList());
		System.out.println(withoutDuplicates);
	}

}
