package com.example.department.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.department.dto.DepartmentDto;
import com.example.department.service.DepartmentService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/department")
@RequiredArgsConstructor
public class DepartmentController {

	private final DepartmentService departmentService;

	// http://localhost:2026/api/department/create
	@PostMapping("/create")
	public ResponseEntity<DepartmentDto> saveDepartment(@Valid @RequestBody DepartmentDto departmentDto) {
		return new ResponseEntity<DepartmentDto>(departmentService.createDepartment(departmentDto), HttpStatus.CREATED);
	}

	// http://localhost:2026/api/department/getById/{id}
	@GetMapping("/getById/{id}")
	public ResponseEntity<DepartmentDto> getDepartmentByid(@PathVariable("id") String departmentCode) {
		return new ResponseEntity<DepartmentDto>(departmentService.getDepartmentByCode(departmentCode), HttpStatus.OK);
	}

	// http://localhost:2026/api/department/getAllDepartments
	@GetMapping("/getAllDepartments")
	public ResponseEntity<List<DepartmentDto>> getAllDepartments() {
		return new ResponseEntity<>(departmentService.getAllDepartments(), HttpStatus.OK);
	}

	// http://localhost:2026/api/department/delete/{id}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteDepartmentByid(@PathVariable Long id) {
		departmentService.deleteDepartment(id);
		return new ResponseEntity<String>("Department Deleted Successfully!..", HttpStatus.OK);
	}

}
