package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.demo.dto.APIResponseDto;
import com.example.demo.dto.DepartmentDto;
import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;
import com.example.demo.exception.EmailAlreadyExistsException;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.mapper.EmployeeMapper;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeOpenFeign;
import com.example.demo.service.EmployeeService;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

	private final @NonNull EmployeeRepository employeeRepository;
//	private final @NonNull RestTemplate restTemplate;
//	private final @NonNull WebClient webClient;
	private final @NonNull EmployeeOpenFeign openFeign;

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
	public APIResponseDto getEmployeeById(Long id) {
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee", "id", id));
//		ResponseEntity<DepartmentDto> responseEntity = restTemplate.getForEntity(
//				"http://localhost:2026/api/department/getById/" + employee.getDepartmentCode(), DepartmentDto.class);
//		DepartmentDto dto = responseEntity.getBody();
		
//		DepartmentDto dto = webClient.get()
//		.uri("http://localhost:2026/api/department/getById/"+ employee.getDepartmentCode())
//		.retrieve()
//		.bodyToMono(DepartmentDto.class)
//		.block();
		DepartmentDto dto = openFeign.getDepartmentByid(employee.getDepartmentCode());
		EmployeeDto employeeDto = new EmployeeDto(employee.getEmployeeId(), employee.getEmployeeName(),
				employee.getPhno(), employee.getSalary(), employee.getEmail(), employee.getEmail());
		APIResponseDto responseDto = new APIResponseDto(employeeDto, dto);
		return responseDto;
//				EmployeeMapper.MAPPER.mapToAPIApiResponseDto(employee, dto);
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
