package java8Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import models.Employee;

public class FindEmployeeWithHighestSalary {
	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>(Arrays.asList(new Employee(1, "Hari", "Java", 35000),
				new Employee(1, "Harsha", "Testing", 30000), new Employee(1, "Reddappa", "Java", 45000),
				new Employee(1, "Saideep", "Data", 35000), new Employee(1, "Eliyaz", "Mean", 55000)));
		Map<String, Optional<Employee>> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDept,
				Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
		System.out.println(collect);
	}

}
