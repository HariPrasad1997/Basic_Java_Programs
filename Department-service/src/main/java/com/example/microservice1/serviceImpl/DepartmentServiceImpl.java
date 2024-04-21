package com.example.microservice1.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.microservice1.dto.DepartmentDto;
import com.example.microservice1.entity.Department;
import com.example.microservice1.repository.DepartmentRepository;
import com.example.microservice1.service.DepartmentService;
import com.example.microservice1.util.DepartmentUtil;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

	private final @NonNull DepartmentRepository departmentRepository;
	private final @NonNull DepartmentUtil departmentUtil;

	@Override
	public DepartmentDto saveDepartment(DepartmentDto departmentDto) {

		// convert department dto to department jpa entity

//		Department department = DepartmentUtil.convertDepartmentToJPA(departmentDto);
		Department department = new Department(departmentDto.getId(), departmentDto.getDepartmentName(),
				departmentDto.getDepartmentDescription(), departmentDto.getDepartmentCode());

		Department saveDepartment = departmentRepository.save(department);

//		DepartmentDto dto = DepartmentUtil.convertJPAToDto(saveDepartment);
		DepartmentDto dto = new DepartmentDto(saveDepartment.getId(), saveDepartment.getDepartmentName(),
				saveDepartment.getDepartmentDescription(), saveDepartment.getDepartmentCode());
		return dto;

	}

	@Override
	public DepartmentDto getDepartmentByCode(String departmentCode) {

		Department saveDepartment = departmentRepository.findDepartmentByCode(departmentCode);
		DepartmentDto dto = new DepartmentDto(saveDepartment.getId(), saveDepartment.getDepartmentName(),
				saveDepartment.getDepartmentDescription(), saveDepartment.getDepartmentCode());
		return dto;
	}

	@Override
	public List<DepartmentDto> getAllDepartments() {
		return null;
	}

}
