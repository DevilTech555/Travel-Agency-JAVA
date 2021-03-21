package com.saarathi.beans;

public class RouteBooking {
	private int rb_id;
	private int custIdRb;
	private int employeeIdRb;
	private int vehicleIdRb;
	private String bookingDateTime;
	private int noOfSeats;
	private double pricing;
	private int routeId;
	public RouteBooking(int rb_id, int custIdRb, int employeeIdRb, int vehicleIdRb, String bookingDateTime,
			int noOfSeats, double pricing, int routeId) {
		super();
		this.rb_id = rb_id;
		this.custIdRb = custIdRb;
		this.employeeIdRb = employeeIdRb;
		this.vehicleIdRb = vehicleIdRb;
		this.bookingDateTime = bookingDateTime;
		this.noOfSeats = noOfSeats;
		this.pricing = pricing;
		this.routeId = routeId;
	}
	public RouteBooking() {
		super();
	}
	public int getRb_id() {
		return rb_id;
	}
	public void setRb_id(int rb_id) {
		this.rb_id = rb_id;
	}
	public int getCustIdRb() {
		return custIdRb;
	}
	public void setCustIdRb(int custIdRb) {
		this.custIdRb = custIdRb;
	}
	public int getEmployeeIdRb() {
		return employeeIdRb;
	}
	public void setEmployeeIdRb(int employeeIdRb) {
		this.employeeIdRb = employeeIdRb;
	}
	public int getVehicleIdRb() {
		return vehicleIdRb;
	}
	public void setVehicleIdRb(int vehicleIdRb) {
		this.vehicleIdRb = vehicleIdRb;
	}
	public String getBookingDateTime() {
		return bookingDateTime;
	}
	public void setBookingDateTime(String bookingDateTime) {
		this.bookingDateTime = bookingDateTime;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public double getPricing() {
		return pricing;
	}
	public void setPricing(double pricing) {
		this.pricing = pricing;
	}
	public int getRouteId() {
		return routeId;
	}
	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}
	
	
}
