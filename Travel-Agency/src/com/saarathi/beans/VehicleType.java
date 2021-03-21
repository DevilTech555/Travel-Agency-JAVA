package com.saarathi.beans;

public class VehicleType {
	private int id;
	private String name;
	private int seats;
	public VehicleType(int id, String name, int seats) {
		super();
		this.id = id;
		this.name = name;
		this.seats = seats;
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
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	@Override
	public String toString() {
		return "VehicleType [id=" + id + ", name=" + name + ", seats=" + seats + "]";
	}
}
