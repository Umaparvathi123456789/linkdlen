package com.telusko.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.telusko.demo.been.Student;
@Service
public class StudentService {
		

	List<Student> list  = new ArrayList<>(List.of(new Student("1001","Wayne Gentry","5/03/2005"),
			new Student("1002","Cathy Baker","02/10/2005"),
			new Student("1003","Zayam Dean","3/12/2004"),
			new Student("1004","Isa Mclead", "18/042005"),
			new Student("1005","Jud Wiks", "4/06/2005"),
			new Student("1006","Sally Driscoll", "3/10/2004")
		
		
			));
	@GetMapping("/fetchListStudentDetailsinAscendingOrder")
	public List<Student> fetchListStudentDetailsinAscendingorder(){	

		return list;
		
	}

		public List<Student> fetchListStudentDetails() {
			
			return list;
		}
		public Student fetchStudentDetails(String no){	
			
			Student st = new Student(no, no, no); 
			for(Student s : list) {
				if(s.getStudentId().equals(no)) {
					st = s;
					
				}}
			return st ;
		}

	   public boolean addStudentDetails(Student stu) {
		   list.add(stu);
		   return true;
		}
	   public boolean updateStudentDetails(Student stu) {
		  
		   for(Student s : list) {	
				if(s.getStudentId().equals(stu.getStudentId())) {
				
					s.setStuduentName(stu.getStuduentName());
					s.setDateOfBirth(stu.getDateOfBirth());
				}	}
		  
		   return true;
			
		}
	   
	   public boolean deleteStudentDetails(Student stu) {
		
		   for(int i=0;i<list.size();i++) {
			   if(list.get(i).getStudentId().equals(stu.getStudentId())) {
				   list.remove(i);
			   }
		   }
		  
		   return true;
			
		}
}
