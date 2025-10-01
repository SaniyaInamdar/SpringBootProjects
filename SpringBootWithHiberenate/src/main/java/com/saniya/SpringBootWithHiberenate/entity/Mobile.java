package com.saniya.SpringBootWithHiberenate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mobile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String mobilename;
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", mobilename=" + mobilename + "]";
	}
	public Mobile() {
		
	}
	public Mobile(int id, String mobilename) {
		super();
		this.id = id;
		this.mobilename = mobilename;
	}
	public Mobile(String mobilename) {
		super();
		this.mobilename = mobilename;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMobilename() {
		return mobilename;
	}
	public void setMobilename(String mobilename) {
		this.mobilename = mobilename;
	}
	
}
