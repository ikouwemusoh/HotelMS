package com.usoh.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usoh.models.User;
import com.usoh.repository.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo userRepo;
	
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}
	
	public void deleteUser(Integer id) {
		userRepo.deleteById(id);
	}
	
	public User getUser(Integer id) {
		return userRepo.findById(id).get();
	}
	
	public User createUser(User user) {
		return userRepo.save(user);
		
	}
	
	public String checkPassword(String password, String confirmPassword) {
		String error="";
		if(password.equals(confirmPassword)) {
			error="correct";
		}else {
			error="Password not the same";
		}
		return error;
	}
	
}
