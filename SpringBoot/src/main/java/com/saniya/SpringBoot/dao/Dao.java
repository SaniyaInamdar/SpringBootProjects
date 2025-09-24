package com.saniya.SpringBoot.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import com.saniya.SpringBoot.controller.Student;

public class Dao {
	
	private final static String url="jdbc:mysql://localhost:3306/StudDB";
	private final static String username="root";
	private final static String password="root";
	private Connection con =null;
	private PreparedStatement pstmt=null;
	
	Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection(url,username,password);
		return con;
	}
	
	public void addStudent(Student s) throws Exception {
		String sql="insert into student values(?,?)";
		pstmt=getConnection().prepareStatement(sql);
		pstmt.setInt(1, s.getId());
		pstmt.setString(2, s.getName());
		pstmt.executeUpdate();
	}

	public void deleteStudent(int id) throws Exception {
		String sql="delete from student where id=?";
		pstmt=getConnection().prepareStatement(sql);
		pstmt.setInt(1,id);
		pstmt.executeUpdate();
	}
	
	public void updateStudent(int id,String name) throws Exception{
		String url="update student set name=? where id=?";
		pstmt=getConnection().prepareStatement(url);
		pstmt.setString(1,name);
		pstmt.setInt(2, id);
		pstmt.executeUpdate();
	}
	

}
