package com.saarathi.beans;

import java.sql.Timestamp;

public class Booking {
	private int id;
	private int customer_id;
	private int employee_id;
	private int vehicle_id;
	private float price;
	private Timestamp bookingDate;
	private boolean tour_route;
	private int tour_id;
	public Booking(int id, int customer_id, int employee_id, int vehicle_id, float price, Timestamp bookingDate,
			boolean tour_route, int tour_id) {
		super();
		this.id = id;
		this.customer_id = customer_id;
		this.employee_id = employee_id;
		this.vehicle_id = vehicle_id;
		this.price = price;
		this.bookingDate = bookingDate;
		this.tour_route = tour_route;
		this.tour_id = tour_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public int getVehicle_id() {
		return vehicle_id;
	}
	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Timestamp getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Timestamp bookingDate) {
		this.bookingDate = bookingDate;
	}
	public boolean isTour_route() {
		return tour_route;
	}
	public void setTour_route(boolean tour_route) {
		this.tour_route = tour_route;
	}
	public int getTour_id() {
		return tour_id;
	}
	public void setTour_id(int tour_id) {
		this.tour_id = tour_id;
	}
	@Override
	public String toString() {
		return "Booking [id=" + id + ", customer_id=" + customer_id + ", employee_id=" + employee_id + ", vehicle_id="
				+ vehicle_id + ", price=" + price + ", bookingDate=" + bookingDate + ", tour_route=" + tour_route
				+ ", tour_id=" + tour_id + "]";
	}
}
