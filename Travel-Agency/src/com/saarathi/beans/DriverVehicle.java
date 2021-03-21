package com.saarathi.beans;

import java.sql.Date;

public class DriverVehicle {
	private int id;
	private int vehicle_id;
	private int employee_id;
	private Date date;
	public DriverVehicle(int id, int vehicle_id, int employee_id, Date date) {
		super();
		this.id = id;
		this.vehicle_id = vehicle_id;
		this.employee_id = employee_id;
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getVehicle_id() {
		return vehicle_id;
	}
	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "DriverVehicle [id=" + id + ", vehicle_id=" + vehicle_id + ", employee_id=" + employee_id + ", date="
				+ date + "]";
	}
}
