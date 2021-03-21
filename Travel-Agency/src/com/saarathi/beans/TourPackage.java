package com.saarathi.beans;

public class TourPackage {
	private int tour_id;
	private String packageName;
	private int noOfDays;
	private double packagePricing;
	private int tripPlannerId;
	public TourPackage(int tour_id, String packageName, int noOfDays, double packagePricing, int tripPlannerId) {
		super();
		this.tour_id = tour_id;
		this.packageName = packageName;
		this.noOfDays = noOfDays;
		this.packagePricing = packagePricing;
		this.tripPlannerId = tripPlannerId;
	}
	public TourPackage() {
		super();
	}
	public int getTour_id() {
		return tour_id;
	}
	public void setTour_id(int tour_id) {
		this.tour_id = tour_id;
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	public double getPackagePricing() {
		return packagePricing;
	}
	public void setPackagePricing(double packagePricing) {
		this.packagePricing = packagePricing;
	}
	public int getTripPlannerId() {
		return tripPlannerId;
	}
	public void setTripPlannerId(int tripPlannerId) {
		this.tripPlannerId = tripPlannerId;
	}
	
	
}
