package com.example.demo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

	private Long employeeId;
	@NotEmpty(message = "Employee Name should Not be null or empty")
	private String employeeName;
//	@Max(message = "Phone Number must be 10 digits", value = 10)
	@NotNull
	private Long phno;
	@Max(value = 70000)
	@NotNull(message = "Employee Salary should not be null or empty")
	private double salary;
	@NotEmpty(message = "Employee Email should Not be null or empty")
	@Email(message = "Email should be valid")
	private String email;
	private String departmentCode;

}
