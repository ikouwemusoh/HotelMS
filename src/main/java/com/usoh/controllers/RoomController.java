package com.usoh.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


import com.usoh.models.Room;
import com.usoh.service.RoomService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequestMapping("/rooms")
public class RoomController {
	@Autowired
	private RoomService roomService;
	
	@GetMapping("/")
	public String view(Model model) {
		model.addAttribute("rooms", roomService.getAllRooms());
		return "room/view";
	}
	
	
	@GetMapping("/new")
	public String create(Model model) {
		model.addAttribute("room", new Room());
		return "room/new";
	}
	
	
	
	@PostMapping("/new")
	public String create(@ModelAttribute Room room, Model model) {
		roomService.createRoom(room);
		model.addAttribute("rooms", roomService.getAllRooms());
		return "redirect:/rooms/";
	}
	
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Integer id, Model model) {
		roomService.deleteRoom(id);
		model.addAttribute("rooms", roomService.getAllRooms());
		return "redirect:/rooms/";
	}
	
	
	@GetMapping("/edit/{id}")
	public String editForm(@PathVariable Integer id, Model model) {
		Room room=roomService.getRoom(id);
		model.addAttribute("room",room);
		return "room/edit";
	}
	
	
	
	@PostMapping("/edit")
	public String edit(@ModelAttribute Room room, Model model) {
		roomService.createRoom(room);
		model.addAttribute("rooms", roomService.getAllRooms());
		return "redirect:/rooms/";
	}
	
}
