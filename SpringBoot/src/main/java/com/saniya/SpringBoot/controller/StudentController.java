package com.saniya.SpringBoot.controller;


import java.util.List;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.saniya.SpringBoot.service.StudentService;

@RestController
public class StudentController {
	StudentService service=new StudentService();
	@PostMapping("/add")
	public void insertStudent(@RequestBody Student s) throws Exception{
		service.addStudent(s);
	}
	
	@DeleteMapping("/{id}")
	public void deleteStudent(@PathVariable int id) throws Exception {
		service.deleteStudent(id);
	}
	
	@PutMapping("/{id}")
	public void updateStudent(@PathVariable int id,@RequestBody Student s)throws Exception{
		service.updateStudent(id, s.getName());
	}
	
	@GetMapping("/get")
	public List<Student> getAllStudents()throws Exception{
		return service.showStudents();
	}
	
	
}
