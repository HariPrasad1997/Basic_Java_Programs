package com.harsha.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentsFilterAndSorting {
	public static void main(String[] args) {

		// Find the students whose rank between 50 to 100
		List<Student> collect = getAllStudents().stream()
				.filter(student -> student.getRank() > 50 && student.getRank() < 100).collect(Collectors.toList());
		System.out.println(collect);

		// Find the students who stays in Kadapa and sort them by their names
		List<Student> collect2 = getAllStudents().stream()
				.filter(student -> student.getCity().equalsIgnoreCase("kadapa"))
				.sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
		System.out.println(collect2);

		// Find the all student names
		List<String> collect3 = getAllStudents().stream().map(student -> student.getName())
				.collect(Collectors.toList());
		System.out.println(collect3);

		// Find all the contact numbers // one to many i.e one student and many contact
		// numbers
		List<Long> collect4 = getAllStudents().stream().flatMap(student -> student.getContacts().stream().distinct())
				.collect(Collectors.toList());
		System.out.println(collect4);

		// Group the students based on gender
		Map<String, Long> collect5 = getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
		System.out.println(collect5);

		// Find the maximum students belongs to which gender
		Entry<String, Long> max = getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGender, Collectors.counting())).entrySet().stream()
				.max(Map.Entry.comparingByValue()).get();
		System.out.println(max);

		// Find the average age of male and female students
		Map<String, Double> collect6 = getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));
		System.out.println(collect6);

		// Find the highest rank in each dept
		Map<String, Optional<Student>> collect7 = getAllStudents().stream().collect(
				Collectors.groupingBy(Student::getDept, Collectors.minBy(Comparator.comparing(Student::getRank))));
		System.out.println(collect7);

		// Find the student who has the second rank
		Student student = getAllStudents().stream().sorted(Comparator.comparing(Student::getRank)).skip(1).findFirst()
				.get();
		System.out.println(student);

	}

	private static List<Student> getAllStudents() {
		List<Student> students = Arrays.asList(
				new Student(1, "Hari", "Male", "Mechanical", "Kadapa", 27, 10, Arrays.asList(9640418201l, 7013131845l)),
				new Student(2, "Heshma", "Female", "Electrical", "Tirupati", 25, 07,
						Arrays.asList(9640568201l, 7013765845l)),
				new Student(3, "Ramya", "Female", "Degree", "Nijamabad", 24, 64,
						Arrays.asList(9640417601l, 7013138745l)),
				new Student(4, "Swathi", "Female", "Civil", "Ongole", 28, 38, Arrays.asList(9640418204l, 7013131867l)),
				new Student(5, "Shiva", "Male", "Mechanical", "Kadapa", 23, 22,
						Arrays.asList(9640418221l, 7013131954l)),
				new Student(6, "Harsha", "Male", "Electrical", "Pulivendula", 29, 52,
						Arrays.asList(9640418287l, 7013131889l)),
				new Student(7, "Hasitha", "Female", "Computers", "Tadipatri", 26, 04,
						Arrays.asList(9640416754l, 8765131845l)),
				new Student(8, "Ramana", "Female", "Electronics", "Chittoor", 28, 68,
						Arrays.asList(9640418298l, 7013131987l)),
				new Student(9, "Divya", "Female", "Computers", "Vizag", 23, 73,
						Arrays.asList(9640432145l, 8976531845l)));
		return students;
	}

}
