package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;
import com.example.demo.exception.EmailAlreadyExistsException;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.mapper.EmployeeMapper;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

	private final @NonNull EmployeeRepository employeeRepository;

	@Override
	public EmployeeDto createEmployee(EmployeeDto employeeDto) {
		Optional<Employee> dt = employeeRepository.findEmployeeByEmail(employeeDto.getEmail());
		if (dt.isPresent()) {
			throw new EmailAlreadyExistsException("Employee Email Already Exists in DataBase");
		}

		Employee employee = EmployeeMapper.MAPPER.mapToEmployee(employeeDto);
		Employee savedEmployee = employeeRepository.save(employee);
		EmployeeDto dto = EmployeeMapper.MAPPER.mapToEmployeeDto(savedEmployee);
		return dto;
	}

	@Override
	public EmployeeDto getEmployeeById(Long id) {
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee", "id", id));

		return EmployeeMapper.MAPPER.mapToEmployeeDto(employee);
	}

	@Override
	public List<EmployeeDto> getAllEmployees() {
		List<Employee> employees = employeeRepository.findAll();
		return employees.stream().map((employee) -> EmployeeMapper.MAPPER.mapToEmployeeDto(employee))
				.collect(Collectors.toList());
	}

	@Override
	public EmployeeDto updateEmployee(EmployeeDto employeeDto) {
		Employee existingEmployee = employeeRepository.findById(employeeDto.getEmployeeId())
				.orElseThrow(() -> new ResourceNotFoundException("Employee", "Id", employeeDto.getEmployeeId()));
		existingEmployee.setEmployeeName(employeeDto.getEmployeeName());
		existingEmployee.setPhno(employeeDto.getPhno());
		existingEmployee.setSalary(employeeDto.getSalary());
		existingEmployee.setEmail(employeeDto.getEmail());
		Employee updatedEmployee = employeeRepository.save(existingEmployee);
		return EmployeeMapper.MAPPER.mapToEmployeeDto(updatedEmployee);
	}

	@Override
	public void deleteEmployeeById(Long id) {
		Employee existingEmployee = employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee", "Id", id));
		employeeRepository.deleteById(id);

	}

}
