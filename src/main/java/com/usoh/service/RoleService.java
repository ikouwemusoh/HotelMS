package com.usoh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usoh.models.Role;
import com.usoh.repository.RoleRepo;

@Service
public class RoleService {
	@Autowired
	private RoleRepo roleRepo;
	
	public List<Role> getAllRoles() {
		return roleRepo.findAll();
	}
	
	public void deleteRole(Integer id) {
		roleRepo.deleteById(id);
	}
	
	public Role getRole(Integer id) {
		return roleRepo.findById(id).get();
	}
	
	public Role createRole(Role role) {
		return roleRepo.save(role);
	}
}
