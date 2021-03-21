package com.saarathi.beans;

import java.sql.Date;

public class TourBooking {
	private int id;
	private int tour_id;
	private Date startDate;
	private Date endDate;
	public TourBooking(int id, int tour_id, Date startDate, Date endDate) {
		super();
		this.id = id;
		this.tour_id = tour_id;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTour_id() {
		return tour_id;
	}
	public void setTour_id(int tour_id) {
		this.tour_id = tour_id;
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
	@Override
	public String toString() {
		return "TourBooking [id=" + id + ", tour_id=" + tour_id + ", startDate=" + startDate + ", endDate=" + endDate
				+ "]";
	}
}
