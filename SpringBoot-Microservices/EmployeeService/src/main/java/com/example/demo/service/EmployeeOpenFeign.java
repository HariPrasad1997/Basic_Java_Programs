package com.example.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.dto.DepartmentDto;

// url = "http://localhost:2026/api/department"
@FeignClient(url = "http://localhost:2026/api/department", name = "DEPARTMENT-SERVICE")
public interface EmployeeOpenFeign {

	@GetMapping("/getById/{id}")
	public DepartmentDto getDepartmentByid(@PathVariable("id") String departmentCode);

}