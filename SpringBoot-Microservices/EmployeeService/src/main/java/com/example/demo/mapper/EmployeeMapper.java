package com.example.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.demo.dto.APIResponseDto;
import com.example.demo.dto.DepartmentDto;
import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;

@Mapper
public interface EmployeeMapper {

	EmployeeMapper MAPPER = Mappers.getMapper(EmployeeMapper.class);

	EmployeeDto mapToEmployeeDto(Employee employee);

	Employee mapToEmployee(EmployeeDto employeeDto);

	APIResponseDto mapToAPIApiResponseDto(Employee employee, DepartmentDto departmentDto);

}
