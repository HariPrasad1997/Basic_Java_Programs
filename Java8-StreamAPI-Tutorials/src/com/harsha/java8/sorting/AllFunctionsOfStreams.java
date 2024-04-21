package com.harsha.java8.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AllFunctionsOfStreams {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>(Arrays.asList(new Employee(1, "Hari", 26, 35000),
				new Employee(1, "Siva", 23, 30000), new Employee(1, "Sudheer", 25, 28000),
				new Employee(1, "Ajay", 27, 37000), new Employee(1, "Chiranjeev", 28, 32000)));
		/**
		 * allMatch --> it will take predicate as parameter which is a functional
		 * interface which will take one argument and return the boolean value either
		 * true or false ex 1: "Hari" with these name only one field is available not
		 * all the fields so it will return false ex: 2: id 1 is available in the list
		 * of all employee objects so it will return true
		 */
		boolean allMatch = employees.stream().allMatch(a -> a.getId() == 1);
//		System.out.println(allMatch);

		/**
		 * anyMatch --> it will take predicate as parameter which is a functional
		 * interface which will take one argument and return the boolean value either
		 * true or false if any value is available based on the passing parameter object
		 * ex: "Hari" is available in the String so it will return true
		 */
		boolean anyMatch = employees.stream().anyMatch(a -> a.getName().contains("Hari"));
//		System.out.println(anyMatch);

		/**
		 * we can able to add one new employee because we are using ArrayList which is
		 * dynamic in nature,if we use only Arrays.asList then we can't add new
		 * employees in the list.
		 */
		employees.add(new Employee(4, "Arya", 29, 40000));
//		System.out.println(employees);

		employees.add(3, new Employee(5, "Chinna", 30, 20000));
//		System.out.println(employees);

		/** Returns the count of elements in this stream */
		long count = employees.stream().count();
//		System.out.println("count of employees " + count);

		/**
		 * distinct() method will not allow the duplicate elements from the list of
		 * objects ex: in the below list it will return only [1, 3, 4, 5, 6, 7] bcz 1, 3
		 * are duplicate two times
		 */
		List<Integer> list = Arrays.asList(1, 3, 4, 5, 6, 7, 3, 1);
		List<Integer> distinctNumbers = list.stream().distinct().collect(Collectors.toList());
//		System.out.println(distinctNumbers);

		List<Employee> distinct = employees.stream().distinct().filter(emp -> emp.getAge() != 5).distinct()
				.collect(Collectors.toList());
//		System.out.println(distinct.toString());

		Integer findAny = list.stream().findAny().get();
//		System.out.println(findAny);

		Integer findFirst = list.stream().findFirst().get();
//		System.out.println(findFirst);

		Employee employee = employees.stream().findFirst().get();
//		System.out.println(employee);

		List<Employee> filter = employees.stream().filter(emp -> emp.getSalary() > 38000).collect(Collectors.toList());
		System.out.println(filter);

		Map<Long, Long> countBasedOnSalary = employees.stream()
				.collect(Collectors.groupingBy(Employee::getSalary, Collectors.counting()));
		System.out.println(countBasedOnSalary);

		// Find the highest paid salary person in the list
		Employee highestDSalary = employees.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary))).get();
		System.out.println(highestDSalary);
	}

}
