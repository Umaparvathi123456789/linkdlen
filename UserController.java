package com.uma.linkdlen.controller;

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

import com.uma.linkdlen.entity.User;
import com.uma.linkdlen.repo.UserRepository;

@RestController
@RequestMapping("/edit/job/preference")

public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/user")
	public String getjobTitles() {
		return "welcome";
	}


	@PostMapping("/user")
	public User newUser(@RequestBody User newUser) {
		return userRepository.save(newUser);
	}

	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@GetMapping("/user/{jobTitles}")
	 public User getUserByjobTitles(@PathVariable String jobTitles) {
		return userRepository.findByjobTitles(jobTitles);
	}

@PutMapping("/user/{jobTitles}")
	public String updateUser(@RequestBody User user, @PathVariable String jobTitles) {
		User newUser=userRepository.findByjobTitles(jobTitles).get();
			newUser.setLocationTypes(newUser.getLocationTypes());
			newUser.setLocationOnSite(newUser.getLocationOnSite());
			newUser.setStartdate(newUser.getStartdate());
			newUser.setEmployementType(newUser.getEmployementType());
			newUser.setVisibility(newUser.getVisibility());
			
			userRepository.save(newUser(null));
		return "updated..";
}

	@DeleteMapping("/user/delete/{jobTitles}")
public 	String deleteUser(@PathVariable String jobTitles) {
		User deleteUser=userRepository.findByjobTitles(jobTitles).get();
		userRepository.delete(deleteUser);
		return "user deleted with job title: "+jobTitles;
}

}
