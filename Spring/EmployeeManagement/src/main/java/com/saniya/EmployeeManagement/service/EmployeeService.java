package com.saniya.EmployeeManagement.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.saniya.EmployeeManagement.model.Employee;

@Component
public interface EmployeeService {
	List<Employee> getAllEmployees();
	Employee saveEmployee(Employee employee);
	Employee getEmployeeById(int id);
	void deleteEmployee(int id);
}
