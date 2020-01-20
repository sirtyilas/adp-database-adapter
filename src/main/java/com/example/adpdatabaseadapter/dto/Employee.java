package com.example.adpdatabaseadapter.dto;

public class Employee {
	
	private String name ;
	private String surname;
	private String idNum;
	
	
	public Employee(String name, String surname, String id) {
		this.name=name;
		this.surname= surname;
		this.idNum = id;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getIdNum() {
		return idNum;
	}
	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}
	

}
