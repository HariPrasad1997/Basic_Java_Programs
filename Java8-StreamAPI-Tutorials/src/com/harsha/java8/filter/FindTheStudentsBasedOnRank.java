package com.harsha.java8.filter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindTheStudentsBasedOnRank {
	public static void main(String[] args) {

		// find the list of students whose rank is between 50 to 100
		List<Student> collect = getAllStudents().stream()
				.filter(student -> student.getRank() > 50 && student.getRank() < 100).collect(Collectors.toList());
		System.out.println(collect);

		// Find the students who stays in Karnataka and sort them by their names
		List<Student> collect2 = getAllStudents().stream().filter(city -> city.getCity().equalsIgnoreCase("Karnataka"))
				.sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
		System.out.println(collect2);

		// Find the all student names
		List<String> collect3 = getAllStudents().stream().map(student -> student.getCity()).distinct()
				.collect(Collectors.toList());
		System.out.println(collect3);

		// Find all the contact numbers

		List<Long> collect4 = getAllStudents().stream().flatMap(student -> student.getContact().stream()).distinct()
				.collect(Collectors.toList());
		System.out.println(collect4);
		// one to one --> map
		// one to many --> flatMap

		// Group the students based on gender
		Map<Object, Long> collect5 = getAllStudents().stream()
				.collect(Collectors.groupingBy(gen -> gen.getGender(), Collectors.counting()));
		System.out.println(collect5);

		// Find the maximum students belongs to which gender
		Entry<String, Long> collect6 = getAllStudents().stream()
				.collect(Collectors.groupingBy(gen -> gen.getGender(), Collectors.counting())).entrySet().stream()
				.max(Map.Entry.comparingByKey()).get();
		System.out.println(collect6);

		// Find the average age of male and female students
		Map<String, Double> collect7 = getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getRank)));
		System.out.println(collect7);

		// Find the highest rank in each dept
		Map<Integer, Optional<Student>> collect8 = getAllStudents().stream().collect(
				Collectors.groupingBy(Student::getId, Collectors.minBy(Comparator.comparing(Student::getRank))));
		System.out.println(collect8);

		// Find the student who has the second rank
		Student collect9 = getAllStudents().stream().sorted(Comparator.comparing(Student::getRank)).skip(1).findFirst()
				.get();
		System.out.println(collect9);

	}

	private static List<Student> getAllStudents() {

		List<Student> students = Arrays.asList(
				new Student(1, "Hari", "Male", "AndhraPradesh", 30, Arrays.asList(7013131845l, 9640419201l)),
				new Student(2, "Hasitha", "Female", "Kerala", 45, Arrays.asList(7013131851l, 9640419201l)),
				new Student(3, "Harsha", "Male", "Karnataka", 15, Arrays.asList(7013131849l, 9640419201l)),
				new Student(4, "Ramya", "Female", "Telangana", 07, Arrays.asList(7013131848l, 9640419201l)),
				new Student(5, "Chinna", "Male", "Maharastra", 60, Arrays.asList(7013131847l, 9640419201l)),
				new Student(6, "Anand", "Male", "Karnataka", 87, Arrays.asList(7013131846l, 9640419201l)));
		return students;
	}
}
