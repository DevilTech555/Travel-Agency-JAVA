package com.saarathi.beans;

public class Vehicle {
	private int vehicleId;
	private String name;
	private String vehicleNumber;
	private int vehicleTypeId;
	private int seats;
	
	public Vehicle(int vehicleId, String name, String vehicleNumber, int vehicleTypeId, int seats) {
		super();
		this.vehicleId = vehicleId;
		this.name = name;
		this.vehicleNumber = vehicleNumber;
		this.vehicleTypeId = vehicleTypeId;
		this.seats = seats;
	}
	public Vehicle() {
		super();
	}
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public int getVehicleTypeId() {
		return vehicleTypeId;
	}
	public void setVehicleTypeId(int vehicleTypeId) {
		this.vehicleTypeId = vehicleTypeId;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
