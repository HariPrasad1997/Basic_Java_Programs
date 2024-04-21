package com.harsha.java8.forEach;

import java.util.ArrayList;
import java.util.List;

public class ListForEachExample {
	public static void main(String[] args) {
//		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
//		list.forEach(numbers -> System.out.print(numbers + " "));

		List<Person> allPersons = getAllPersons();
		// prior java 8
		/*
		 * for (Person person : allPersons) { System.out.println(person.getName() + " "
		 * + person.getAge()); }
		 */

		allPersons.stream().forEach((p1) -> {
			System.out.println(p1.getId() + " : " + p1.getName() + " : " + p1.getAge());
		});
	}

	private static List<Person> getAllPersons() {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person(1, "Karthik", 30));
		persons.add(new Person(2, "Vinay", 29));
		persons.add(new Person(3, "Srinivas", 35));
		persons.add(new Person(4, "Shiva", 27));
		return persons;
	}
}
