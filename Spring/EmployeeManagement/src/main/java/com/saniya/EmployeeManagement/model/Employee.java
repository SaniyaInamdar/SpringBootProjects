package com.saniya.EmployeeManagement.model;

public class Employee {
	private String name;
	private Double salary;
	private String role;
	private int id;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, Double salary, String role, int id) {
		super();
		this.name = name;
		this.salary = salary;
		this.role = role;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", role=" + role + ", id=" + id + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
