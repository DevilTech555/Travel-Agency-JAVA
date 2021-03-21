package com.saarathi.beans;

import java.sql.Date;

public class Employee {
	private int id;
	private String name;
	private Date DOB; 
	private String email;
	private int phone;
	private String address;
	private int salary_id;
	private int department_id;
	private String username;
	private String passsword;
	public Employee(int id, String name, Date dOB, String email, int phone, String address, int salary_id,
			int department_id, String username, String passsword) {
		super();
		this.id = id;
		this.name = name;
		DOB = dOB;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.salary_id = salary_id;
		this.department_id = department_id;
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
	public int getSalary_id() {
		return salary_id;
	}
	public void setSalary_id(int salary_id) {
		this.salary_id = salary_id;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
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
		return "Employee [id=" + id + ", name=" + name + ", DOB=" + DOB + ", email=" + email + ", phone=" + phone
				+ ", address=" + address + ", salary_id=" + salary_id + ", department_id=" + department_id
				+ ", username=" + username + ", passsword=" + passsword + "]";
	}
}
