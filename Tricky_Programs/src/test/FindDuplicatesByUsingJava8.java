package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicatesByUsingJava8 {

	private static List<Integer> findDuplicates(int[] num) {
		Set<Integer> set = new HashSet<>();
		List<Integer> duplicates = new ArrayList<>();

		for (int nums : num) {
			if (!set.add(nums)) {
				duplicates.add(nums);
			}
		}
		return duplicates;
	}

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 2, 4, 7, 8 };
		List<Integer> duplicates = findDuplicates(num);
		System.out.println("Duplicates: " + duplicates);
	}

}
