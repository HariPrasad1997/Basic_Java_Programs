package com.harsha.java8.forEach;

import java.util.HashMap;
import java.util.Map;

public class MapForEach {
	public static void main(String[] args) {
		Map<Integer, Person> map = new HashMap<>();
		map.put(1, new Person(101, "Vinay", 30));
		map.put(2, new Person(102, "Aadhi", 35));
		map.put(3, new Person(103, "Ashok", 38));
		map.put(4, new Person(104, "Sandeep", 27));

		// prior java 8
		/*
		 * for (Entry<Integer, Person> person : map.entrySet()) {
		 * System.out.println(person.getKey() + " " + person.getValue().getName()); }
		 */

		// using java 8 streams
		map.forEach((p1, p2) -> {
			System.out.println(p2.getId() + " " + p2.getName() + " " + p2.getAge());
		});
	}

}
