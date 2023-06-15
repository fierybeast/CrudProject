package com.Crud.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Crud.project.model.User;
import com.Crud.project.repository.UserRepository;

@RestController
//@RequestMapping("/User")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/user")
	User newUser(@RequestBody User user ) {
		return userRepository.save(user);
	}
	
	@GetMapping("/get")
	List<User> getUsers(){
		return userRepository.findAll();
	}

	
}
