package com.example.department.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.department.dto.DepartmentDto;
import com.example.department.entity.Department;

@Mapper
public interface DepartmentMapper {
	
	DepartmentMapper MAPPER = Mappers.getMapper(DepartmentMapper.class);
	
	Department mapToDepartment(DepartmentDto departmentDto);
	DepartmentDto mapToDepartmentDto(Department department);
	
}
