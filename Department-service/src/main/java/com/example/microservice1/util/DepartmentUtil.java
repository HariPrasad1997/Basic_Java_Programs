package com.example.microservice1.util;

import org.springframework.stereotype.Component;

import com.example.microservice1.dto.DepartmentDto;
import com.example.microservice1.entity.Department;

@Component
public class DepartmentUtil {

	public static Department convertDepartmentToJPA(DepartmentDto departmentDto) {
		Department department = new Department(departmentDto.getId(), departmentDto.getDepartmentName(),
				departmentDto.getDepartmentDescription(), departmentDto.getDepartmentCode());
		return department;
	}

	public static DepartmentDto convertJPAToDto(Department saveDepartment) {
		DepartmentDto dto = new DepartmentDto(saveDepartment.getId(), saveDepartment.getDepartmentName(),
				saveDepartment.getDepartmentDescription(), saveDepartment.getDepartmentCode());
		return dto;
	}

}
