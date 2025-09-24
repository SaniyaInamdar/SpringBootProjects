package com.saniya.SpringBoot.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/getname")
	public String getname() {
		return "Saniya";
	}
	
	Student student=new Student(101,"Saniya");
	
	@GetMapping("/getstudent")
	public Student getStudent() {
		return student;
	}
	
	ArrayList<Student> al=new ArrayList<Student>();
	@GetMapping("/getstudentlist")
	public ArrayList<Student> getstudentlist(){
		al.add(new Student(101,"saniya"));
		al.add(new Student(102,"sara"));
		return al;
	}
}
