package com.io.excel;


public class TeacherBean {
	private String number;
	private String name;
	private String gender;
	private String course;

	public TeacherBean(){}
	
	public TeacherBean(String number,String name, String gender,String course){
		this.number = number;
		this.name = name;
		this.gender = gender;
		this.course = course;
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
