package com.harsha.java8.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSorting {

	public static void main(String[] args) {
		// Case : 1
		// Sort employees based on their salaries in descending order(big to small)
		List<TestEmployee> sorted = getAllEmployees().stream()
				.sorted(Comparator.comparing(TestEmployee::getSalary).reversed()).collect(Collectors.toList());
//		System.out.println(sorted);

		// Case : 2
		List<TestEmployee> sorting = getAllEmployees().stream()
				.sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary())).collect(Collectors.toList());
		System.out.println(sorting);

		// Find sum of elements in an array
		int[] integers = { 2, 3, 4, 5, 7 };
		int sum = Arrays.stream(integers).sum();
//		System.out.println("Sum: " + sum);

		// Fetch top 3 salaried employees details
		List<TestEmployee> collect = getAllEmployees().stream()
				.sorted(Comparator.comparing(TestEmployee::getSalary).reversed()).limit(3).collect(Collectors.toList());
//		System.out.println(collect);

		// Fetch all employees salary less than 3rd highest
		List<TestEmployee> collect2 = getAllEmployees().stream()
				.sorted(Comparator.comparing(TestEmployee::getSalary).reversed()).skip(3).collect(Collectors.toList());
//		System.out.println(collect2);

	}

	private static List<TestEmployee> getAllEmployees() {
		List<TestEmployee> employees = Arrays.asList(new TestEmployee(1, 500), new TestEmployee(2, 1000),
				new TestEmployee(3, 1500), new TestEmployee(4, 5000), new TestEmployee(5, 2500),
				new TestEmployee(6, 3000), new TestEmployee(7, 3500));
		return employees;
	}
}
