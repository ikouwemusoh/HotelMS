package com.usoh.models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class SendingMessage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private LocalDateTime timeSent;
	@ManyToOne
	private Message message;
	@ManyToOne
	private RoomAllocation roomAllocation;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getTimeSent() {
		return timeSent;
	}
	public void setTimeSent(LocalDateTime timeSent) {
		this.timeSent = timeSent;
	}
	public Message getMessage() {
		return message;
	}
	public void setMessage(Message message) {
		this.message = message;
	}
	public RoomAllocation getRoomAllocation() {
		return roomAllocation;
	}
	public void setRoomAllocation(RoomAllocation roomAllocation) {
		this.roomAllocation = roomAllocation;
	}
	@Override
	public String toString() {
		return "SendingMessage [id=" + id + ", timeSent=" + timeSent + ", message=" + message + ", roomAllocation="
				+ roomAllocation + "]";
	}
	public SendingMessage(Integer id, LocalDateTime timeSent, Message message, RoomAllocation roomAllocation) {
		super();
		this.id = id;
		this.timeSent = timeSent;
		this.message = message;
		this.roomAllocation = roomAllocation;
	}
	public SendingMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
