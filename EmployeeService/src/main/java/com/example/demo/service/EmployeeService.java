package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.EmployeeDto;

public interface EmployeeService {

	public EmployeeDto createEmployee(EmployeeDto employeeDto);

	public EmployeeDto getEmployeeById(Long id);

	public List<EmployeeDto> getAllEmployees();

	public EmployeeDto updateEmployee(EmployeeDto employeeDto);

	public void deleteEmployeeById(Long id);

}
