package interview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeImpl {
	public static void main(String[] args) {

		// Find the number of male & female employees in the list
		Map<String, Long> collect = getEmployees().stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(collect);

		// Find average salary based on gender
		Map<String, Double> collect2 = getEmployees().stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getSalary)));
		System.out.println(collect2);

		// Sort employees based on their age
		List<Employee> collect3 = getEmployees().stream().sorted(Comparator.comparing(Employee::getAge).reversed())
				.collect(Collectors.toList());
		System.out.println(collect3);

	}

	private static List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "Harsha", 27, "Male", 35000));
		employees.add(new Employee(2, "Hasitha", 26, "Female", 40000));
		employees.add(new Employee(3, "Gautham", 30, "Male", 38000));
		employees.add(new Employee(4, "Swathi", 28, "Female", 50000));
		return employees;
	}
}
