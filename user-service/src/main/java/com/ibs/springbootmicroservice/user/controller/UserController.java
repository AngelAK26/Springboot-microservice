package com.ibs.springbootmicroservice.user.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibs.springbootmicroservice.user.entity.User;
import com.ibs.springbootmicroservice.user.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
	
	@GetMapping("/{id}")
	public Optional<User> getUserById(@PathVariable("id") long userId) {
		return userService.getUser(userId);
	}

	

}