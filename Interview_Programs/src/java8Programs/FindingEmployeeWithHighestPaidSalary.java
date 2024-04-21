package java8Programs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class FindingEmployeeWithHighestPaidSalary {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "Harsha", "Java", 30000));
		employees.add(new Employee(2, "Ravi", "Devops", 20000));
		employees.add(new Employee(3, "Raju", "Data", 40000));
		employees.add(new Employee(4, "Mahesh", "Devops", 25000));
		employees.add(new Employee(5, "Suresh", "Mean", 25000));
		employees.add(new Employee(6, "Ramesh", "Java", 25000));
//		List<Employee> collect = employees.stream().filter((highest) -> highest.getSalary() == 40000)
//				.collect(Collectors.toList());
//		System.out.println(collect);

		Comparator<Employee> coparingBySalary = Comparator.comparing(Employee::getSalary);
		Map<String, Optional<Employee>> collect2 = employees.stream().collect(
				Collectors.groupingBy(Employee::getDept, Collectors.reducing(BinaryOperator.maxBy(coparingBySalary))));

		System.out.print(collect2+" ");
	}

}
