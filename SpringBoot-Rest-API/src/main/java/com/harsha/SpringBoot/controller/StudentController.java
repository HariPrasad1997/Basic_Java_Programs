package com.harsha.SpringBoot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.harsha.SpringBoot.bean.Student;

@RestController
public class StudentController {

	// http://localhost:8080/student

	@GetMapping("/student")
	public ResponseEntity<Student> getStudent() {
		Student student = new Student(101, "Harsha", 80);
//		return new ResponseEntity<Student>(student, HttpStatus.OK);
		return ResponseEntity.ok().header("Custom-Header", "Authorization").body(student);
	}
//	http://localhost:8080/getAll

	@GetMapping("getAll")
	public ResponseEntity<List<Student>> getAllStudents() {
		List<Student> students = new ArrayList<>();
		students.add(new Student(101, "Arya", 70));
		students.add(new Student(102, "Madhu", 80));
		students.add(new Student(103, "Arjun", 65));
		students.add(new Student(104, "Obuleshu", 80));
		return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
	}

	// http://localhost:8080/student/101/Arjun/85

	@GetMapping("student/{id}/{name}/{marks}")
	public ResponseEntity<Student> studentPathvariable(@PathVariable("id") long id, @PathVariable String name,
			@PathVariable int marks) {
		Student student = new Student(id, name, marks);
		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}

	// http://localhost:8080/student/query?id=1&name=Shiva&marks=82
	@GetMapping("/student/query")
	public ResponseEntity<Student> studentRequestParm(@RequestParam long id, @RequestParam String name,
			@RequestParam int marks) {

		Student student = new Student(id, name, marks);
		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}

	// http://localhost:8080/create

	@PostMapping("/create")
	@ResponseStatus(code = HttpStatus.CREATED)
	public ResponseEntity<Student> createStudent(@RequestBody Student student) {
		System.out.println(student.getId() + "\n" + student.getName() + "\n" + student.getMarks());
		return new ResponseEntity<Student>(student, HttpStatus.CREATED);
	}

	// http://localhost:8080/student/1/update
	@PutMapping("student/{id}/update")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student, @PathVariable long id) {
		System.out.println(student.getName() + "\n" + student.getMarks());
		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}

	// http://localhost:8080/delete/1

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable long id) {
		System.out.println(id);
		return ResponseEntity.ok("Student deleted Successfully!");
	}

}
