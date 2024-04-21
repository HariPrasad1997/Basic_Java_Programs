package com.example.department.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.department.dto.DepartmentDto;
import com.example.department.entity.Department;
import com.example.department.exception.ResourceNotFoundException;
import com.example.department.mapper.DepartmentMapper;
import com.example.department.repository.DepartmentRepository;
import com.example.department.service.DepartmentService;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

	private final @NonNull DepartmentRepository departmentRepository;

	@Override
	public DepartmentDto createDepartment(DepartmentDto departmentDto) {
		Department department = DepartmentMapper.MAPPER.mapToDepartment(departmentDto);
		Department saveDepartment = departmentRepository.save(department);
		DepartmentDto dto = DepartmentMapper.MAPPER.mapToDepartmentDto(saveDepartment);
		return dto;
	}

//	@Override
//	public DepartmentDto getDepartmentByCode(String  departmentCode) {
//		Department department = departmentRepository.findByDepartmentCode(departmentCode)
//				.orElseThrow(() -> new ResourceNotFoundException("Department", "Id", id));
//		return DepartmentMapper.MAPPER.mapToDepartmentDto(department);
//	}

	@Override
	public List<DepartmentDto> getAllDepartments() {
		List<Department> departments = departmentRepository.findAll();
		return departments.stream().map((department) -> DepartmentMapper.MAPPER.mapToDepartmentDto(department))
				.collect(Collectors.toList());
	}

	@Override
	public void deleteDepartment(Long id) {
		Department department = departmentRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Department", "Id", id));
		departmentRepository.deleteById(id);

	}

	@Override
	public DepartmentDto getDepartmentByCode(String departmentCode) {
		Department department = departmentRepository.findByDepartmentCode(departmentCode);
		return DepartmentMapper.MAPPER.mapToDepartmentDto(department);
	}

}
