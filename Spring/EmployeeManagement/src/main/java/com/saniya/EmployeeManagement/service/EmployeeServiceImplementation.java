package com.saniya.EmployeeManagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.saniya.EmployeeManagement.model.Employee;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

	private final List<Employee> employees =new ArrayList<Employee>();
	private int nextId=1;
	
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employees;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		if(employee.getId()==0) {
			employee.setId(nextId++);
			employees.add(employee);
		}
		else {
			Employee existing=getEmployeeById(employee.getId());
			if(existing !=null) {
				existing.setName(employee.getName());
				existing.setRole(employee.getRole());
				existing.setSalary(employee.getSalary());
			}
		}
		return employee;
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return employees.stream().filter(e-> e.getId()==id).findFirst().orElse(null);
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		employees.removeIf(e-> e.getId()==id);
	}

}
