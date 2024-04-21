package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	String name;
	int age;
	double salary;

	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [ salary=" + salary + "]";
	}

}

public class FindMaxSalary {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		Employee e1 = new Employee("Harsha", 25, 30000);
		Employee e2 = new Employee("Ravi", 20, 25000);
		Employee e3 = new Employee("Suresh", 30, 40000);
		Employee e4 = new Employee("Ravi", 23, 22000);
		Employee e5 = new Employee("Ravi", 22, 21000);
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);

		System.out.println("Before Increment: " + employees);
		List<Employee> result = employees.stream().map(e -> {
			if (e.getAge() >= 25) {
				e.setSalary(e.getSalary() * 1.10);
			}
			return e;
		}).collect(Collectors.toList());
		System.out.println("After increment : " + result);

		System.out.println("Before Increment: " + employees);
		List<Employee> collect = employees.stream().map(e -> {
			if (e.getAge() <= 25) {
				e.setSalary(e.getSalary() * 1.10);
			}
			return e;
		}).collect(Collectors.toList());
		System.out.println("After increment: " + collect);
	}

}
