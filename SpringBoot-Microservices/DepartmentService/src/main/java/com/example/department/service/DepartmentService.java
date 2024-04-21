package com.example.department.service;

import java.util.List;

import com.example.department.dto.DepartmentDto;

public interface DepartmentService {

	public DepartmentDto createDepartment(DepartmentDto departmentDto);

	public DepartmentDto getDepartmentByCode(String departmentCode);

	public List<DepartmentDto> getAllDepartments();

	public void deleteDepartment(Long id);

}
