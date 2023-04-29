package com.academy.demo.model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class AcademyModel {
 @Id
 private int admissionnumber;
 private String username;
private String firstname;
 private String lastname;
 private int age;
 private String dob;
 private float percentage;
 private String parentname;
 private String course;
 private String level;
 private long phonenumber;
 public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public int getAdmissionnumber() {
	return admissionnumber;
}
public void setAdmissionnumber(int admissionnumber) {
	this.admissionnumber = admissionnumber;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public float getPercentage() {
	return percentage;
}
public void setPercentage(float percentage) {
	this.percentage = percentage;
}
public String getParentname() {
	return parentname;
}
public void setParentname(String parentname) {
	this.parentname = parentname;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public String getLevel() {
	return level;
}
public void setLevel(String level) {
	this.level = level;
}
public long getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(long phonenumber) {
	this.phonenumber = phonenumber;
}
}
