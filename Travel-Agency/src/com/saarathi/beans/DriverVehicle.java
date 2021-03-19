package com.saarathi.beans;

public class DriverVehicle {
	private int driverId;
	private int vehicleId;
	public DriverVehicle(int driverId, int vehicleId) {
		super();
		this.driverId = driverId;
		this.vehicleId = vehicleId;
	}
	public DriverVehicle() {
		super();
	}
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	
	
}
