package com.saarathi.beans;

import java.util.Date;

public class TourBooking {
	private int tbId;
	private int custIdTb;
	private int tourId;
	private int empIdTb;
	private int vehicleIdTb;
	private String bookingDateTime;
	private Date startDate;
	private Date endDate;
	private double totalPrice;
	public TourBooking(int tbId, int custIdTb, int tourId, int empIdTb, int vehicleIdTb, String bookingDateTime,
			Date startDate, Date endDate, double totalPrice) {
		super();
		this.tbId = tbId;
		this.custIdTb = custIdTb;
		this.tourId = tourId;
		this.empIdTb = empIdTb;
		this.vehicleIdTb = vehicleIdTb;
		this.bookingDateTime = bookingDateTime;
		this.startDate = startDate;
		this.endDate = endDate;
		this.totalPrice = totalPrice;
	}
	public TourBooking() {
		super();
	}
	public int getTbId() {
		return tbId;
	}
	public void setTbId(int tbId) {
		this.tbId = tbId;
	}
	public int getCustIdTb() {
		return custIdTb;
	}
	public void setCustIdTb(int custIdTb) {
		this.custIdTb = custIdTb;
	}
	public int getTourId() {
		return tourId;
	}
	public void setTourId(int tourId) {
		this.tourId = tourId;
	}
	public int getEmpIdTb() {
		return empIdTb;
	}
	public void setEmpIdTb(int empIdTb) {
		this.empIdTb = empIdTb;
	}
	public int getVehicleIdTb() {
		return vehicleIdTb;
	}
	public void setVehicleIdTb(int vehicleIdTb) {
		this.vehicleIdTb = vehicleIdTb;
	}
	public String getBookingDateTime() {
		return bookingDateTime;
	}
	public void setBookingDateTime(String bookingDateTime) {
		this.bookingDateTime = bookingDateTime;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
}
