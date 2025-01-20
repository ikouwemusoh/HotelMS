package com.usoh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usoh.models.Message;
import com.usoh.repository.MessageRepo;

@Service
public class MessageService {
	@Autowired
	private MessageRepo messageRepo;
	
	public List<Message> getAllMessage() {
		return messageRepo.findAll();
	}
	
	public void deleteMessage(Integer id) {
		messageRepo.deleteById(id);
	}
	
	public Message getMessage(Integer id) {
		return messageRepo.findById(id).get();
	}
	
	public Message createMessage(Message message) {
		return messageRepo.save(message);
	}
}
