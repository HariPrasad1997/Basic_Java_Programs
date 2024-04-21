package com.harsha.java8.sorting;

public class TestEmployee {

	private int id;
	private int salary;

	public TestEmployee(int id, int salary) {
		super();
		this.id = id;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "TestEmployee [id=" + id + ", salary=" + salary + "]";
	}

}
