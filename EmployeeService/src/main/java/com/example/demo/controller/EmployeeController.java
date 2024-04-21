package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.service.EmployeeService;

import jakarta.validation.Valid;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/employee")
@RequiredArgsConstructor
public class EmployeeController {

	private final @NonNull EmployeeService service;

	// http://localhost:2025/api/employee/create

	@PostMapping("/create")
	public ResponseEntity<EmployeeDto> createEmployee(@Valid @RequestBody EmployeeDto employeeDto) {
		return new ResponseEntity<EmployeeDto>(service.createEmployee(employeeDto), HttpStatus.CREATED);
	}

	// http://localhost:2025/api/employee/getById/2
	@GetMapping("getById/{id}")
	public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable Long id) {
		return new ResponseEntity<EmployeeDto>(service.getEmployeeById(id), HttpStatus.OK);
	}

	// http://localhost:2025/api/employee/getAll
	@GetMapping("/getAll")
	public ResponseEntity<List<EmployeeDto>> getAllEmployees() {
		return new ResponseEntity<>(service.getAllEmployees(), HttpStatus.OK);
	}

	// http://localhost:2025/api/employee/update/{id}

	@PutMapping("/update/{id}")
	public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable Long id, @Valid @RequestBody EmployeeDto employeeDto) {
		employeeDto.setEmployeeId(id);
		return new ResponseEntity<EmployeeDto>(service.updateEmployee(employeeDto), HttpStatus.OK);
	}

	// http://localhost:2025/api/employee/delete/{id}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteEmployeeByid(@PathVariable Long id) {
		service.deleteEmployeeById(id);
		return new ResponseEntity<String>("Employee Deleted Successfully!..", HttpStatus.OK);
	}

}
