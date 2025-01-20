package com.usoh.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Message {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String title;
	private String content;
	@OneToMany(mappedBy = "message")
	private List<SendingMessage> sendingMessages;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public List<SendingMessage> getSendingMessages() {
		return sendingMessages;
	}
	public void setSendingMessages(List<SendingMessage> sendingMessages) {
		this.sendingMessages = sendingMessages;
	}
	@Override
	public String toString() {
		return "Message [id=" + id + ", name=" + name + ", title=" + title + ", content=" + content
				+ ", sendingMessages=" + sendingMessages + "]";
	}
	public Message(Integer id, String name, String title, String content, List<SendingMessage> sendingMessages) {
		super();
		this.id = id;
		this.name = name;
		this.title = title;
		this.content = content;
		this.sendingMessages = sendingMessages;
	}
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
