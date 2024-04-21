package com.example.microservice1.service;

import java.util.List;

import com.example.microservice1.dto.DepartmentDto;

public interface DepartmentService {

	public DepartmentDto saveDepartment(DepartmentDto departmentDto);

	public DepartmentDto getDepartmentByCode(String departmentCode);

	public List<DepartmentDto> getAllDepartments();

}
