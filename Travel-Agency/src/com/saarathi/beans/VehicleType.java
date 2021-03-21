package com.saarathi.beans;

public class VehicleType {
	private int vehicleTypeId;
	private String vehicleTypeName;
	public VehicleType(int vehicleTypeId, String vehicleTypeName) {
		super();
		this.vehicleTypeId = vehicleTypeId;
		this.vehicleTypeName = vehicleTypeName;
	}
	public VehicleType() {
		super();
	}
	public int getVehicleTypeId() {
		return vehicleTypeId;
	}
	public void setVehicleTypeId(int vehicleTypeId) {
		this.vehicleTypeId = vehicleTypeId;
	}
	public String getVehicleTypeName() {
		return vehicleTypeName;
	}
	public void setVehicleTypeName(String vehicleTypeName) {
		this.vehicleTypeName = vehicleTypeName;
	}
	
	
	
}
