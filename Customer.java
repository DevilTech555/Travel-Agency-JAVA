package com.saarathi.beans;

import java.util.Date;

public class Customer {
	private int custId;
	private String custName;
	private String dob;
	private String email;
	private Long phno;
	private String address;
	private String password;
	public Customer(int custId, String custName, String dob, String email, Long phno, String address,String password) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.dob = dob;
		this.email = email;
		this.phno = phno;
		this.address = address;
		this.password = password;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password =password;
	}
	
	

	
	
	
}
