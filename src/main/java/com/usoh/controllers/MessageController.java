package com.usoh.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.usoh.models.Message;
import com.usoh.service.MessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.PostMapping;






@Controller
@RequestMapping("/messages")
public class MessageController {
	@Autowired
	private MessageService messageService;
	
	@GetMapping("/")
	public String view(Model model) {
		model.addAttribute("messages", messageService.getAllMessage());
		return "message/view";
	}
	
	
	@GetMapping("/new")
	public String create(Model model) {
		model.addAttribute("message", new Message());
		return "message/new";
	}
	
	
	
	@PostMapping("/new")
	public String create(@ModelAttribute Message message, Model model) {
		messageService.createMessage(message);
		model.addAttribute("messages", messageService.getAllMessage());
		return "redirect:/messages/";
	}
	
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Integer id, Model model) {
		messageService.deleteMessage(id);
		model.addAttribute("messages", messageService.getAllMessage());
		return "redirect:/messages/";
	}
	
	
	@GetMapping("/edit/{id}")
	public String editForm(@PathVariable Integer id, Model model) {
		Message message=messageService.getMessage(id);
		model.addAttribute("message", message);
		return "message/edit";
	}
	
	
	
	@PostMapping("/edit")
	public String edit(@ModelAttribute Message message, Model model) {
		messageService.createMessage(message);
		model.addAttribute("messages", messageService.getAllMessage());
		return "redirect:/messages/";
	}
	
}
