package com.saarathi.beans;

import java.sql.Date;

public class Customer {
	private int id;
	private String name;
	private Date DOB; 
	private String email;
	private int phone;
	private String address;
	private String username;
	private String passsword;
	public Customer(int id, String name, Date dOB, String email, int phone, String address, String username,
			String passsword) {
		super();
		this.id = id;
		this.name = name;
		DOB = dOB;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.username = username;
		this.passsword = passsword;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasssword() {
		return passsword;
	}
	public void setPasssword(String passsword) {
		this.passsword = passsword;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", DOB=" + DOB + ", email=" + email + ", phone=" + phone
				+ ", address=" + address + ", username=" + username + ", passsword=" + passsword + "]";
	}
}
