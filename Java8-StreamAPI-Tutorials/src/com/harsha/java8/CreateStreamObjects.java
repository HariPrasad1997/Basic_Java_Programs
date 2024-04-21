package com.harsha.java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class CreateStreamObjects {
	public static void main(String[] args) {
		// Create a stream
		Stream<String> stream = Stream.of("a", "b", "c", "d");
		stream.forEach(System.out::println);

		// create a stream from sources
		Collection<String> collection = Arrays.asList("Java", "Spring", "Hibernate", "Microservices");
		Stream<String> stream2 = collection.stream();
		stream2.forEach(System.out::println);
 
		// list of stream
		List<String> list = Arrays.asList("Java", "Spring", "Hibernate", "Microservices");
		Stream<String> stream3 = list.stream();
		stream3.forEach(System.out::println);

		// Set of stream
		Set<String> set = new HashSet<>(list);
		set.forEach(System.out::println);

		String[] stringArray = { "Hari", "Ravi", "Arya", "Shiva" };
		Arrays.stream(stringArray).forEach(System.out::println);
	}

}
