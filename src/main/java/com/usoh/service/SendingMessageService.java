package com.usoh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usoh.models.SendingMessage;
import com.usoh.repository.SendingMessageRepo;

@Service
public class SendingMessageService {
	@Autowired
	private SendingMessageRepo sendingMessageRepo;
	
	public List<SendingMessage> getAllSendingMessage() {
		return sendingMessageRepo.findAll();
	}
	
	public void deleteSendingMessage(Integer id) {
		sendingMessageRepo.deleteById(id);
	}
	
	public SendingMessage getSendingMessage(Integer id) {
		return sendingMessageRepo.findById(id).get();
	}
	
	public SendingMessage createSendingMessage(SendingMessage sendingMessage) {
		return sendingMessageRepo.save(sendingMessage);
	}
	
}
