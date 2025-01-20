package com.usoh.controllers;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.usoh.models.User;
import com.usoh.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userService;
	String message="";
	
	@GetMapping("/")
	public String view(Model model) {
		model.addAttribute("users", userService.getAllUsers());
		return "user/view";
	}
	
	
	@GetMapping("/new")
	public String create(Model model) {
		
		model.addAttribute("message", message);
		model.addAttribute("user", new User());
		return "user/new";
	}
	
	
	@PostMapping("/new")
	public String create(@ModelAttribute User user, @RequestParam String pass, Model model) {
		if(userService.checkPassword(pass, user.getPassword()).equals("correct")) {
			user.setDateCreated(LocalDate.now());
			userService.createUser(user);
		}else {
			message="Incorrect Password";
			model.addAttribute("message", message);
			return "redirect:/users/new";
			
		}
		message="";
		model.addAttribute("users", userService.getAllUsers());
		return "redirect:/users/";
	}
	
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Integer id, Model model) {
		userService.deleteUser(id);
		model.addAttribute("users", userService.getAllUsers());
		return "redirect:/users/";
	}
	
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable Integer id, Model model) {
		User user=userService.getUser(id);
		model.addAttribute("user", user);
		return "user/edit";
	}
	
	
	@PostMapping("/edit")
	public String edit(@ModelAttribute User user, Model model) {
		userService.createUser(user);
		model.addAttribute("users", userService.getAllUsers());
		return "redirect:/users/";
	}
	
	
}
