package com.telusko.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.demo.been.Course;
import com.telusko.demo.service.CourseService;
@RestController
@RequestMapping("/api/course")
public class CourseController {	
		@Autowired
		private  CourseService courseService;
		
		@GetMapping("/fetchStudentsDetails")
		public List<Course> fetchListCourseDetails(){	

			return courseService.fetchListCourseDetails();
		}
		
		@GetMapping("/fetchStudentDetails/{feild}")
		public List<Course> fetchListCourseDetails(@PathVariable String feild){	

			return courseService.fetchListCourseDetails(feild);
		}
		@PostMapping("/addStudentDetails")
		public boolean addStudentDetails(@RequestBody Course course) {
			
			return 	courseService.addCourseDetails(course);
		}
		
		@PutMapping("/updateStudentdetails/{classId}")
		public boolean updateStudentDetails(@RequestBody Course course) {
			
			return 	courseService.updateCourseDetails(course);
		}

		@DeleteMapping("/deleteStudentDetails")
		public boolean deleteStudentDetails(@RequestBody Course course) {
			
			return 	courseService.deleteCourseDetails(course);
}}
