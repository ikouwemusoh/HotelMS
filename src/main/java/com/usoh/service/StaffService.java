package com.usoh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usoh.models.Staff;
import com.usoh.repository.StaffRepo;

@Service
public class StaffService {
	@Autowired
	private StaffRepo staffRepo;
	
	public List<Staff> getAllStaff(){
		return staffRepo.findAll();
	}
	
	public void deleteStaff(Integer id) {
		staffRepo.deleteById(id);
	}
	
	public Staff createStaff(Staff staff) {
		return staffRepo.save(staff);
	}
	
	public Staff getStaff(Integer id) {
		return staffRepo.findById(id).get();
	}
	
}
