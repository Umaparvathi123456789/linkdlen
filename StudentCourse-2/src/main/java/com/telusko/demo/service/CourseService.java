package com.telusko.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.telusko.demo.been.Course;
@Service
public class CourseService {
	
	List<Course> list  = new ArrayList<>(List.of(new Course(101,"intoduction to jazz",4),
			new Course(103,"Advanced Guitar",4),
			new Course(104,"jazz Band ", 4),
			new Course(102,"intoduction to guitar",5)));


	public List<Course> fetchListCourseDetails() {
	
		return list;
	}
	public boolean addCourseDetails(Course course) {
		list.add(course);
		return true;
	}

	public boolean updateCourseDetails(Course course) {
		  for(Course c: list) {
				
				if(c.getClassName().equals(course.getClassName())){
				
					c.setClassId(course.getClassId());
					c.setCreditHours(course.getCreditHours());
				}}
		return true;
	}

	public boolean deleteCourseDetails(Course course) {

		   for(int i=0;i<list.size();i++) {
			   if(list.get(i).getClassName().equals(course.getClassName())) {
				   list.remove(i);
			   }}
		return true ;
	}
	public List<Course> fetchListCourseDetails(String feild) {
		// TODO Auto-generated method stub
		return list;
	}


}
