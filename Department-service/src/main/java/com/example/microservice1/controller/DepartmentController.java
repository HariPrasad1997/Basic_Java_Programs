package com.example.microservice1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservice1.dto.DepartmentDto;
import com.example.microservice1.service.DepartmentService;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/departments")
@RequiredArgsConstructor
public class DepartmentController {

	private final @NonNull DepartmentService service;

	// http://localhost:2031/api/departments/create

	@PostMapping("/create")
	public ResponseEntity<DepartmentDto> saveDepartmentDto(@RequestBody DepartmentDto departmentDto) {
		return new ResponseEntity<DepartmentDto>(service.saveDepartment(departmentDto), HttpStatus.CREATED);
	}

	// http://localhost:2031/api/departments/departmentByCode/{code}
	@GetMapping("/departmentByCode/{departmentCode}")
	public ResponseEntity<DepartmentDto> getDepartmentByCode(@PathVariable String departmentCode) {
		return new ResponseEntity<DepartmentDto>(service.getDepartmentByCode(departmentCode), HttpStatus.OK);
	}

}
