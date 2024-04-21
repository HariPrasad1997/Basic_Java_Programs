package java8Programs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeesBasedOnSalariesInDescending {
	public static void main(String[] args) {

		// Sort employees based on their salaries in descending order

		List<Employees> descendingOrder = getEmployees().stream()
				.sorted(Comparator.comparing(Employees::getSalary).reversed()).collect(Collectors.toList());
		System.out.println(descendingOrder);

		// Fetch top 3 salaried employees
//		List<Employees> top3Highest = getEmployees().stream().filter(emp -> emp.getSalary() >= 2500)
//				.collect(Collectors.toList());
		List<Employees> top3Highest = getEmployees().stream()
				.sorted(Comparator.comparing(Employees::getSalary).reversed()).limit(3).collect(Collectors.toList());
		System.out.println(top3Highest);

		// Fetch all employees having salary less than 3rd highest
//		List<Employees> salaryLessThanThirdHighest = getEmployees().stream().filter(emp -> emp.getSalary() < 2500)
//				.collect(Collectors.toList());
		List<Employees> salaryLessThanThirdHighest = getEmployees().stream()
				.sorted(Comparator.comparing(Employees::getSalary).reversed()).skip(3).collect(Collectors.toList());
		System.out.println(salaryLessThanThirdHighest);

	}

	private static List<Employees> getEmployees() {
		List<Employees> employees = new ArrayList<>();
		employees.add(new Employees(1, 500));
		employees.add(new Employees(1, 1000));
		employees.add(new Employees(1, 1500));
		employees.add(new Employees(1, 2000));
		employees.add(new Employees(1, 2500));
		employees.add(new Employees(1, 3000));
		employees.add(new Employees(1, 3500));
		return employees;
	}

}
