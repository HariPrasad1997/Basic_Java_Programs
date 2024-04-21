package com.example.department.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDto {

	private Long departmentId;
	@NotEmpty(message = "Department Name should not be empty or null")
	private String departmentName;
	@NotEmpty(message = "Department Code should not be empty or null")
	private String departmentCode;
	@Max(value = 100)
	@NotNull
	private double departmentStrength;
	@NotEmpty(message = "Department Description should not be empty or null")
	private String departmentDescription;

}
