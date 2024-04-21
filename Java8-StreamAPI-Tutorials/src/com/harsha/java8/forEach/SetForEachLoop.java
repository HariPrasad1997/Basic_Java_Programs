package com.harsha.java8.forEach;

import java.util.HashSet;
import java.util.Set;

public class SetForEachLoop {
	public static void main(String[] args) {
		Set<Person> persons = new HashSet<>();
		persons.add(new Person(11, "Hari", 26));
		persons.add(new Person(12, "Arya", 28));
		persons.add(new Person(13, "Arjun", 24));
		persons.add(new Person(14, "Mani", 31));

		// prior java 8
		for (Person person : persons) {
			System.out.println(person.getName() + " " + person.getAge());
		}
		
		
		// using java 8 streams
		/*
		 * persons.stream().forEach((p1) -> { System.out.println(p1.getId() + " " +
		 * p1.getName() + " " + p1.getAge()); });
		 */
	}

}
