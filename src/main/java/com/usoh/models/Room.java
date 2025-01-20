package com.usoh.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private double roomLength;
	private double roomWidth;
	private double price;
	private double matrassSize;
	private int acCapacity;
	private int fanNumber;
	private int numberSeaterCussionChair;
	private int bath;
	private boolean heaterAvailable;
	private int tvSize;
	private boolean isOccupied;
	private boolean isBlocked;
	@OneToMany(mappedBy = "room")
	private List<RoomAllocation> roomAllocations;
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
	public double getRoomLength() {
		return roomLength;
	}
	public void setRoomLength(double roomLength) {
		this.roomLength = roomLength;
	}
	public double getRoomWidth() {
		return roomWidth;
	}
	public void setRoomWidth(double roomWidth) {
		this.roomWidth = roomWidth;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getMatrassSize() {
		return matrassSize;
	}
	public void setMatrassSize(double matrassSize) {
		this.matrassSize = matrassSize;
	}
	public int getAcCapacity() {
		return acCapacity;
	}
	public void setAcCapacity(int acCapacity) {
		this.acCapacity = acCapacity;
	}
	public int getFanNumber() {
		return fanNumber;
	}
	public void setFanNumber(int fanNumber) {
		this.fanNumber = fanNumber;
	}
	public int getNumberSeaterCussionChair() {
		return numberSeaterCussionChair;
	}
	public void setNumberSeaterCussionChair(int numberSeaterCussionChair) {
		this.numberSeaterCussionChair = numberSeaterCussionChair;
	}
	public int getBath() {
		return bath;
	}
	public void setBath(int bath) {
		this.bath = bath;
	}
	public boolean isHeaterAvailable() {
		return heaterAvailable;
	}
	public void setHeaterAvailable(boolean heaterAvailable) {
		this.heaterAvailable = heaterAvailable;
	}
	public int getTvSize() {
		return tvSize;
	}
	public void setTvSize(int tvSize) {
		this.tvSize = tvSize;
	}
	public boolean isOccupied() {
		return isOccupied;
	}
	public void setOccupied(boolean isOccupied) {
		this.isOccupied = isOccupied;
	}
	public boolean isBlocked() {
		return isBlocked;
	}
	public void setBlocked(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}
	public List<RoomAllocation> getRoomAllocations() {
		return roomAllocations;
	}
	public void setRoomAllocations(List<RoomAllocation> roomAllocations) {
		this.roomAllocations = roomAllocations;
	}
	@Override
	public String toString() {
		return "Room [id=" + id + ", name=" + name + ", roomLength=" + roomLength + ", roomWidth=" + roomWidth
				+ ", price=" + price + ", matrassSize=" + matrassSize + ", acCapacity=" + acCapacity + ", fanNumber="
				+ fanNumber + ", numberSeaterCussionChair=" + numberSeaterCussionChair + ", bath=" + bath
				+ ", heaterAvailable=" + heaterAvailable + ", tvSize=" + tvSize + ", isOccupied=" + isOccupied
				+ ", isBlocked=" + isBlocked + ", roomAllocations=" + roomAllocations + "]";
	}
	public Room(Integer id, String name, double roomLength, double roomWidth, double price, double matrassSize,
			int acCapacity, int fanNumber, int numberSeaterCussionChair, int bath, boolean heaterAvailable, int tvSize,
			boolean isOccupied, boolean isBlocked, List<RoomAllocation> roomAllocations) {
		super();
		this.id = id;
		this.name = name;
		this.roomLength = roomLength;
		this.roomWidth = roomWidth;
		this.price = price;
		this.matrassSize = matrassSize;
		this.acCapacity = acCapacity;
		this.fanNumber = fanNumber;
		this.numberSeaterCussionChair = numberSeaterCussionChair;
		this.bath = bath;
		this.heaterAvailable = heaterAvailable;
		this.tvSize = tvSize;
		this.isOccupied = isOccupied;
		this.isBlocked = isBlocked;
		this.roomAllocations = roomAllocations;
	}
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
