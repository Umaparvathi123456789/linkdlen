package com.telusko.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.demo.been.Student;
import com.telusko.demo.service.StudentService;

	@RestController
	@RequestMapping("/api/student")
	public class StudentController {
		@Autowired
		private StudentService studentService;
		
		@GetMapping("/fetchListStudentDetails")
		public List<Student> fetchListStudentDetails(){	

			return studentService.fetchListStudentDetails();
		}
		@GetMapping("/fetchListStudentDetailsinAscendingOrder")
		public List<Student> fetchListStudentDetailsinAscendingorder(){	
			
			return studentService.fetchListStudentDetails();
			
		}
		@PostMapping("/addStudentDetails")
		public boolean addStudentDetails(@RequestBody Student stu) {
			
			return 	studentService.addStudentDetails(stu);
		}
		
		@PutMapping("/updateStudentDetails/{no}")
		public boolean updateStudentDetails(@RequestBody Student stu) {
			
			return 	studentService.updateStudentDetails(stu);
		}

		@DeleteMapping("/deleteStudentDetails")
		public boolean deleteStudentDetails(@RequestBody Student stu) {
			
			return 	studentService.deleteStudentDetails(stu);
		}
}
