package com.telusko.demo.been;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.ManyToMany;

public class Course {
	private  int classId;
	private String className;
	private int creditHours;
	 @ManyToMany(mappedBy="course")
	 @JsonIgnore
	 private Set<Student>student=new HashSet<>();
	
	public Set<Student> getStudent() {
		return student;
	}
	public void setStudent(Set<Student> student) {
		this.student = student;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public int getCreditHours() {
		return creditHours;
	}
	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}
	@Override
	public String toString() {
		return "Course [classId=" + classId + ", className=" + className + ", creditHours=" + creditHours + "]";
	}
	public Course(int classId, String className, int creditHours) {
		super();
		this.classId = classId;
		this.className = className;
		this.creditHours = creditHours;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
}
