package javaTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a program to find duplicate numbers in java.
 * 
 */
public class FindDuplicateNumbersInJava {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i < 10; i++) {
			list.add(i);
		}

		list.add(2);
		list.add(5);
		findDuplicates(list); // using regular concept
		System.out.println(findDup(list)); // using java-8 features i.e distinct keyword
	}

	private static List<Integer> findDuplicates(List<Integer> list) {
		List<Integer> listWithoutDuplicates = new ArrayList<>();
		System.out.println("Duplicate list is: " + list);
		for (Integer i : list) {
			if (listWithoutDuplicates.contains(i)) {
//				System.out.print(i + " ");
			} else {
				listWithoutDuplicates.add(i);
			}
		}
		System.out.println("without duplicates are: " + listWithoutDuplicates);
		return listWithoutDuplicates;
	}

	private static List<Integer> findDup(List<Integer> number) {
		return number.stream().distinct().collect(Collectors.toList());
	}

}
