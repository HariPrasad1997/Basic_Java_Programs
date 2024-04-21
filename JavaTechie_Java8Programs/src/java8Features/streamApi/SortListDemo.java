package java8Features.streamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(18);
		list.add(17);
		list.add(15);
		list.add(16);
//		Collections.sort(list);// Ascending
//		Collections.reverse(list);// Descending
//		System.out.println(list);
//
//		List<Integer> Ascending = list.stream().sorted().collect(Collectors.toList());
//		System.out.println(Ascending);
//
//		List<Integer> descending = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
//		System.out.println(descending);

		// AscendingOrder
		List<Employee> sortingBasedOnSalary = EmployeeImpl.getEmployees().stream()
				.sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
		System.out.println(sortingBasedOnSalary);

		List<Employee> descendingOreder = EmployeeImpl.getEmployees().stream()
				.sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
		System.out.println(descendingOreder);

	}

}
