package com.saarathi.beans;

public class TourPackage {
	private int id;
	private String name;
	private int noOfDays;
	private float price;
	private int trip_plannr_id;
	public TourPackage(int id, String name, int noOfDays, float price, int trip_plannr_id) {
		super();
		this.id = id;
		this.name = name;
		this.noOfDays = noOfDays;
		this.price = price;
		this.trip_plannr_id = trip_plannr_id;
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
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getTrip_plannr_id() {
		return trip_plannr_id;
	}
	public void setTrip_plannr_id(int trip_plannr_id) {
		this.trip_plannr_id = trip_plannr_id;
	}
	@Override
	public String toString() {
		return "TourPackage [id=" + id + ", name=" + name + ", noOfDays=" + noOfDays + ", price=" + price
				+ ", trip_plannr_id=" + trip_plannr_id + "]";
	}
}
