package com.saniya.SpringBoot.service;

import java.util.List;

import com.saniya.SpringBoot.controller.Student;
import com.saniya.SpringBoot.dao.Dao;


public class StudentService {
	Dao d=new Dao();
		public void addStudent(Student s) throws Exception {
			d.addStudent(s);
		}
		
		public void deleteStudent(int id) throws Exception {
			d.deleteStudent(id);
		}
		
		public void updateStudent(int id,String name) throws Exception{
			d.updateStudent(id, name);
		}
		
		public void updateStudentByObject(Student s) throws Exception{
			d.updateStudentByObject(s);
		}
		
		public List<Student> showStudents() throws  Exception{
			return d.showStudents();
		}
		
		public Student getStudentById(int id) throws Exception{
			return d.getStudentById(id);
		}
}
