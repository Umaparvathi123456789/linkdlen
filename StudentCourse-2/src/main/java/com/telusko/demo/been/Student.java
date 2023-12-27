package com.telusko.demo.been;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.ManyToMany;

public class Student {
	private String studentId;
	private String studuentName;
	private String dateOfBirth;
	
	@ManyToMany(cascade=CascadeType.PERSIST)
	private Set<Course> course=new HashSet<>();
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studuentName=" + studuentName + ", dateOfBirth=" + dateOfBirth
				+ "]";
	}
	public Student(String studentId, String studuentName, String dateOfBirth) {
		super();
		this.studentId = studentId;
		this.studuentName = studuentName;
		this.dateOfBirth = dateOfBirth;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStuduentName() {
		return studuentName;
	}
	public void setStuduentName(String studuentName) {
		this.studuentName = studuentName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
