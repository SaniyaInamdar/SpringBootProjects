package com.saniya.EmployeeManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.saniya.EmployeeManagement.model.Employee;
import com.saniya.EmployeeManagement.service.EmployeeService;

import org.springframework.ui.Model;


@Controller
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired	
	private  EmployeeService service ;
	
//	public EmployeeController(EmployeeService service) {
//		this.service=service;
//	}
	
	@GetMapping
	public String listEmployee(Model model) {
		model.addAttribute("employees",service.getAllEmployees());
		return "employees";
	}
	
	@GetMapping("/new")
	public String showForm(Model model) {
		model.addAttribute("employee",new Employee());
		return "add-employee";
	}
	
	@PostMapping
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		service.saveEmployee(employee);
		return "redirect:/employees";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable int id) {
		service.deleteEmployee(id);
		return "redirect:/employees";
	}
	
	@GetMapping("/edit/{id}")
	public String showEditForm(@PathVariable int id, Model model) {
	    Employee employee = service.getEmployeeById(id);
	    model.addAttribute("employee", employee);
	    return "edit-employee";   
	}
	
	@PostMapping("/update/{id}")
	public String updateEmployee(@PathVariable int id, @ModelAttribute("employee") Employee employee) {
	    employee.setId(id); 
	    service.saveEmployee(employee);
	    return "redirect:/employees";
	}
}
