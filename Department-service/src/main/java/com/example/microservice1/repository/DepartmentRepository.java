package com.example.microservice1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.microservice1.entity.Department;

import jakarta.transaction.Transactional;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

	@Transactional
	public Department findDepartmentByCode(String departmentCode);

}
