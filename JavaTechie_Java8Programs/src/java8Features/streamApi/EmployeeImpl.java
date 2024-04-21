package java8Features.streamApi;

import java.util.ArrayList;
import java.util.List;

public class EmployeeImpl {

	public static void main(String[] args) {
		evaluateTaxUsers("ta");

	}

	public static List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(101, "Hari", "Java", 350000));
		employees.add(new Employee(102, "Harsha", "Testing", 800000));
		employees.add(new Employee(103, "Dileep", "Integration", 700000));
		employees.add(new Employee(104, "Reddappa", "Devops", 450000));
		employees.add(new Employee(105, "Nages", "Core", 600000));

		return employees;
	}

	public static void evaluateTaxUsers(String input) {
		if (input.equalsIgnoreCase("tax")) {
			getEmployees().stream().filter(emp -> emp.getSalary() > 500000)
					.forEach(result -> System.out.println(result));
		} else {
			getEmployees().stream().filter(emp -> emp.getSalary() < 500000)
					.forEach(result -> System.out.println(result));
		}
	}

}
