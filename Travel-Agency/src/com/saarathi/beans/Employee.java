package com.saarathi.beans;

import java.util.Date;

public class Employee {
	private int empId;
	private String empName;
	private Date dob;
	private String email;
	private String phno;
	private String address;
	private double salary;
	private int deptId;
	public Employee(int empId, String empName, Date dob, String email, String phno, String address, double salary,
			int deptId) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dob = dob;
		this.email = email;
		this.phno = phno;
		this.address = address;
		this.salary = salary;
		this.deptId = deptId;
	}
	public Employee() {
		super();
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	
	
	
}
