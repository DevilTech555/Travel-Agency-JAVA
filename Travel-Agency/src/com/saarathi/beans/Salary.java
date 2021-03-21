package com.saarathi.beans;

import java.sql.Date;

public class Salary {
	private int id;
	private float salary;
	private Date date;
	public Salary(int id, float salary, Date date) {
		super();
		this.id = id;
		this.salary = salary;
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Salary [id=" + id + ", salary=" + salary + ", date=" + date + "]";
	}
}
