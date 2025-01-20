package com.usoh.controllers;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.usoh.models.Role;
import com.usoh.models.Room;
import com.usoh.service.RoleService;
import com.usoh.service.RoomService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequestMapping("/roles")
public class RoleController {
	@Autowired
	private RoleService roleService;
	
	@GetMapping("/")
	public String view(Model model) {
		model.addAttribute("roles", roleService.getAllRoles());
		return "role/view";
	}
	
	
	@GetMapping("/new")
	public String create(Model model) {
		model.addAttribute("role", new Role());
		return "role/new";
	}
	
	
	
	@PostMapping("/new")
	public String create(@ModelAttribute Role role, Model model) {
		role.setDateCreated(LocalDate.now());
		roleService.createRole(role);
		model.addAttribute("roles", roleService.getAllRoles());
		return "redirect:/roles/";
	}
	
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Integer id, Model model) {
		roleService.deleteRole(id);
		model.addAttribute("roles", roleService.getAllRoles());
		return "redirect:/roles/";
	}
	
	
	@GetMapping("/edit/{id}")
	public String editForm(@PathVariable Integer id, Model model) {
		Role role=roleService.getRole(id);
		model.addAttribute("role",role);
		return "role/edit";
	}
	
	
	
	@PostMapping("/edit")
	public String edit(@ModelAttribute Role role, Model model) {
		roleService.createRole(role);
		model.addAttribute("roles", roleService.getAllRoles());
		return "redirect:/roles/";
	}
	
}
