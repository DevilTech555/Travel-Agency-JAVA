package com.saarathi.beans;

import java.util.Date;

public class Customer {
	private int custId;
	private String custName;
	private Date dob;
	private String email;
	private String password;
	private String phno;
	private String address;
	
	public Customer(int custId, String custName, Date dob, String email, String password, String phno, String address) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.dob = dob;
		this.email = email;
		this.password = password;
		this.phno = phno;
		this.address = address;
	}
	public Customer() {
		super();
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
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
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
