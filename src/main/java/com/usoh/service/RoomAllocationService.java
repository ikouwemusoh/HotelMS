package com.usoh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usoh.models.RoomAllocation;
import com.usoh.repository.RoomAllocationRepo;

@Service
public class RoomAllocationService {
	@Autowired
	private RoomAllocationRepo roomAllocationRepo;
	
	public List<RoomAllocation> getAllRoomAllocation() {
		return roomAllocationRepo.findAll();
	}
	
	
	public void deleteRoomAllocation(Integer id) {
		roomAllocationRepo.deleteById(id);
	}
	
	public RoomAllocation getRoomAllocation(Integer id) {
		return roomAllocationRepo.findById(id).get();
	}
	
	
	public RoomAllocation createRoomAllocation(RoomAllocation roomAllocation) {
		return roomAllocationRepo.save(roomAllocation);
	}
	
}
