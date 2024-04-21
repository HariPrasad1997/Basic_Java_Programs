package com.example.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.bean.Student;

@RestController
public class StudentController {

	// http://localhost:2024/student

	@GetMapping("/student")
	private Student getStudent() {
		return new Student(1, "Hari Prasad", "Kathi");
	}

	// http://localhost:2024/students
	@GetMapping("/students")
	private List<Student> getAllStudents() {
		List<Student> list = new ArrayList<>();
		list.add(new Student(1, "Harsha", "Kathi"));
		list.add(new Student(2, "Chinna", "Papagalla"));
		list.add(new Student(3, "Amarnath", "Kathi"));
		list.add(new Student(4, "Raju", "Papagalla"));
		return list;
	}

	// SpringBoot Rest api with path variable

//	http://localhost:2024/student/id/Kathi/RaviKumar
	// {id} --> URI template variable
	@GetMapping("student/{id}/{firstName}/{lastName}")
	private Student studentPathVariable(@PathVariable int id, @PathVariable String firstName,
			@PathVariable String lastName) {
		return new Student(id, firstName, lastName);
	}

}
