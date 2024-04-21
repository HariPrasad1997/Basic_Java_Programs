package com.harsha.java8.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSorting {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 22, 3, 408, 5, 63, 7, 18, 9);
		// Ascending Order case: 1
		List<Integer> collect = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println("Case 1: " + collect + " ");

		// Ascending Order case: 2
		List<Integer> collect2 = list.stream().sorted().collect(Collectors.toList());
		System.out.println("Case 2: " + collect2 + " ");

		// Ascending Order case : 3
		List<Integer> collect3 = list.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());
		System.out.println("Case 3: " + collect3 + " ");

		// Descending Order : Case 1
		List<Integer> collect4 = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("Case 1 " + collect4 + " ");
		// Descending Order : Case 1
		List<Integer> collect5 = list.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
		System.out.println("Case 2 " + collect5 + " ");

		// Descending Order : Case 3
		List<Integer> collect6 = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("Case 3 " + collect6 + " ");

		// Sorting list of Employee Objects in Ascending order based on salary
		List<Employee> employees = getAllEmployees();
		// Case : 1
//		Stream<Employee> collect7 = employees.stream().sorted(new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return (int) (o1.getSalary() - o2.getSalary());
//			}
//		});
//		collect7.forEach(System.out::println);

		// Case 2
		List<Employee> collect8 = employees.stream().sorted((e1, e2) -> (int) (e1.getSalary() - e2.getSalary()))
				.collect(Collectors.toList());
		System.out.println(collect8);

		// Case 3
		var collect10 = employees.stream().sorted(Comparator.comparingLong(Employee::getSalary))
				.collect(Collectors.toList());
		System.out.println(collect10);

		// Descending Oreder Case 1
		List<Employee> collect9 = employees.stream().sorted((e1, e2) -> (int) (e2.getSalary() - e1.getSalary()))
				.collect(Collectors.toList());
		System.out.println(collect9);
		// Case 2
		var collect11 = employees.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed())
				.collect(Collectors.toList());
		System.out.println(collect11);

		// Comparing based on age // Ascending Order
		var collect13 = employees.stream().sorted(Comparator.comparingInt(Employee::getAge))
				.collect(Collectors.toList());
		System.out.println(collect13);

		// Descending Order based on age
		var collect14 = employees.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed())
				.collect(Collectors.toList());
		System.out.println(collect14);

		// Ascending order based on name
		var collect15 = employees.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
		System.out.println(collect15);

		// Descending order based on name
		var collect16 = employees.stream().sorted(Comparator.comparing(Employee::getName).reversed())
				.collect(Collectors.toList());
		System.out.println(collect16);

	}

	private static List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "Harsha", 25, 30000));
		employees.add(new Employee(2, "Hari", 27, 35000));
		employees.add(new Employee(3, "Shiva", 35, 40000));
		employees.add(new Employee(4, "Arya", 15, 28000));
		employees.add(new Employee(5, "Mahesh", 22, 50000));
		return employees;
	}

}
