package com.saarathi.beans;

public class Vehicle {
	private int id;
	private String number;
	private int type_id;
	public Vehicle(int id, String number, int type_id) {
		super();
		this.id = id;
		this.number = number;
		this.type_id = type_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getType_id() {
		return type_id;
	}
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", number=" + number + ", type_id=" + type_id + "]";
	}
}
