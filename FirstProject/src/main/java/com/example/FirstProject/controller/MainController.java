package com.example.FirstProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FirstProject.model.User;
import com.example.FirstProject.repository.UserRepo;

@RestController
public class MainController {

	@Autowired
	User user;

	@Autowired
	UserRepo repo;

	@PostMapping("/home")
	public User addUser(User user) {
		repo.save(user);
		return user;
	}

	@GetMapping("/home")
	public List<User> getUser() {
		return repo.findAll();
	}
	 
	@PatchMapping("/home")
	public User editUser(User user) {
		repo.save(user);
		return user;
	}
	
	@PutMapping("/home") // if the data is not there it will be created and if data is there it will be updated
	public User updateandcreateUser(User user) {
		repo.save(user);
		return user;
	}
	
	@DeleteMapping("/home/{id}")
	public String deleteUser(@PathVariable Integer id){
		repo.deleteById(id);
		return "record is deleted..";
	}
	

}
