package com.usoh.models;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(unique = true, nullable = false)
	private String email;
	@Column(nullable = false)
	private String password;
	private String fname;
	private String lname;
	@Column(unique = true, nullable = false)
	private String phone;
	private LocalDate dob;
	@Column(nullable = false)
    private LocalDate dateCreated;
    private String address;
    private String city;
    private String country;
    private boolean isBlocked;
    private boolean isActivated;
    
    @OneToMany(mappedBy = "user")
    private List<RoomAllocation> roomAllocations;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public LocalDate getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(LocalDate dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public boolean isBlocked() {
		return isBlocked;
	}

	public void setBlocked(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}

	public boolean isActivated() {
		return isActivated;
	}

	public void setActivated(boolean isActivated) {
		this.isActivated = isActivated;
	}

	public List<RoomAllocation> getRoomAllocations() {
		return roomAllocations;
	}

	public void setRoomAllocations(List<RoomAllocation> roomAllocations) {
		this.roomAllocations = roomAllocations;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", password=" + password + ", fname=" + fname + ", lname="
				+ lname + ", phone=" + phone + ", dob=" + dob + ", dateCreated=" + dateCreated + ", address=" + address
				+ ", city=" + city + ", country=" + country + ", isBlocked=" + isBlocked + ", isActivated="
				+ isActivated + ", roomAllocations=" + roomAllocations + "]";
	}

	public User(Integer id, String email, String password, String fname, String lname, String phone, LocalDate dob,
			LocalDate dateCreated, String address, String city, String country, boolean isBlocked, boolean isActivated,
			List<RoomAllocation> roomAllocations) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.fname = fname;
		this.lname = lname;
		this.phone = phone;
		this.dob = dob;
		this.dateCreated = dateCreated;
		this.address = address;
		this.city = city;
		this.country = country;
		this.isBlocked = isBlocked;
		this.isActivated = isActivated;
		this.roomAllocations = roomAllocations;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
	
}
