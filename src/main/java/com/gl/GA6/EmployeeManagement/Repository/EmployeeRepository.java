package com.gl.GA6.EmployeeManagement.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.GA6.EmployeeManagement.Entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	List<Employee> findByFirstNameContainsAllIgnoreCase(String firstName);

	List<Employee> findAllByOrderByFirstNameAsc();
}
