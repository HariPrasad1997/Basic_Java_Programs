package oopsConcepts.fundamentals;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Employee {

	private int id;
	private String name;

	public Employee() {
		super();
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		Employee employee1 = new Employee(1, "Ramesh");
		Employee employee2 = new Employee(1, "Krishna");

		System.out.println("Is hashcode same: " + (employee1.hashCode() == employee2.hashCode()));
		System.out.println("Is equals same : " + employee1.equals(employee2));

		Set<Employee> employees = new HashSet<>();
		employees.add(employee1);
		employees.add(employee2);
		System.out.println(employees);
	}

}
