package com.usoh.models;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;


@Entity
public class RoomAllocation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private LocalDateTime allocationTime;
	private LocalDateTime allocationExpireTime;
	@ManyToOne
	private User user;
	@ManyToOne
	private Room room;
	@OneToMany(mappedBy = "roomAllocation")
	private List<SendingMessage> sendingMessages;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getAllocationTime() {
		return allocationTime;
	}
	public void setAllocationTime(LocalDateTime allocationTime) {
		this.allocationTime = allocationTime;
	}
	public LocalDateTime getAllocationExpireTime() {
		return allocationExpireTime;
	}
	public void setAllocationExpireTime(LocalDateTime allocationExpireTime) {
		this.allocationExpireTime = allocationExpireTime;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public List<SendingMessage> getSendingMessages() {
		return sendingMessages;
	}
	public void setSendingMessages(List<SendingMessage> sendingMessages) {
		this.sendingMessages = sendingMessages;
	}
	@Override
	public String toString() {
		return "RoomAllocation [id=" + id + ", allocationTime=" + allocationTime + ", allocationExpireTime="
				+ allocationExpireTime + ", user=" + user + ", room=" + room + ", sendingMessages=" + sendingMessages
				+ "]";
	}
	public RoomAllocation(Integer id, LocalDateTime allocationTime, LocalDateTime allocationExpireTime, User user,
			Room room, List<SendingMessage> sendingMessages) {
		super();
		this.id = id;
		this.allocationTime = allocationTime;
		this.allocationExpireTime = allocationExpireTime;
		this.user = user;
		this.room = room;
		this.sendingMessages = sendingMessages;
	}
	public RoomAllocation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
