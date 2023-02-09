package com.jsp.person.pan.aadhar.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aadhar {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int aadhar_no;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAadhar_no() {
		return aadhar_no;
	}

	public void setAadhar_no(int aadhar_no) {
		this.aadhar_no = aadhar_no;
	}

}
