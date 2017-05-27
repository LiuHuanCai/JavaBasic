package com.io.excel;


public class StudentBean {
	private String number;
	private String name;
	private String gender;
	
	public StudentBean(){}
	
	public StudentBean(String number, String name, String gender){
		this.number = number;
		this.name = name;
		this.gender = gender;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
