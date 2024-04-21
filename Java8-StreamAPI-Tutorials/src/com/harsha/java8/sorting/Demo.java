package com.harsha.java8.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
	public static void main(String[] args) {
		List<Employee> employees = getAllEmployees();
		// Ascending Order Case : 1
		var collect = employees.stream().sorted(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o1.getSalary() - o2.getSalary());
			}
		}).collect(Collectors.toList());
		System.out.println(collect);
		System.out.println("********************************");
		// Case 2

		var collect2 = employees.stream().sorted(Comparator.comparingLong(Employee::getSalary))
				.collect(Collectors.toList());
		System.out.println(collect2);
		System.out.println("**********************************");
		// Case 3

		var collect3 = employees.stream().sorted((e1, e2) -> (int) (e1.getSalary() - e2.getSalary()))
				.collect(Collectors.toList());
		System.out.println(collect3);
		System.out.println("**********************************");

		// Descending Order
		var collect4 = employees.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed())
				.collect(Collectors.toList());
		System.out.println(collect4);
		System.out.println("**********************************");

		// Ascending based on name
		var collect5 = employees.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
		System.out.println(collect5);
        System.out.println("**********************************");
		// Descending Order
		var collect6 = employees.stream().sorted(Comparator.comparing(Employee::getName).reversed())
				.collect(Collectors.toList());
		System.out.println(collect6);
	}

	private static List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(10, "Harsha", 20, 30000));
		employees.add(new Employee(11, "Surya", 30, 40000));
		employees.add(new Employee(12, "Shiva", 25, 25000));
		employees.add(new Employee(13, "Vijay", 27, 50000));
		employees.add(new Employee(14, "Gautham", 32, 38000));
		return employees;
	}
}
