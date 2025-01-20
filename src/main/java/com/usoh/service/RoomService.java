package com.usoh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usoh.models.Room;
import com.usoh.repository.RoomRepo;

@Service
public class RoomService {
	@Autowired
	private RoomRepo roomRepo;
	
	public List<Room> getAllRooms() {
		return roomRepo.findAll();
	}
	
	public void deleteRoom(Integer id) {
		roomRepo.deleteById(id);
	}
	
	public Room getRoom(Integer id) {
		return roomRepo.findById(id).get();
	}
	
	public Room createRoom(Room room) {
		return roomRepo.save(room);
	}
}
