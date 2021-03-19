package com.saarathi.beans;

public class TripPlanner {
	private int tripPlannerId;
	private String tripPlannerName;
	public TripPlanner(int tripPlannerId, String tripPlannerName) {
		super();
		this.tripPlannerId = tripPlannerId;
		this.tripPlannerName = tripPlannerName;
	}
	public TripPlanner() {
		super();
	}
	public int getTripPlannerId() {
		return tripPlannerId;
	}
	public void setTripPlannerId(int tripPlannerId) {
		this.tripPlannerId = tripPlannerId;
	}
	public String getTripPlannerName() {
		return tripPlannerName;
	}
	public void setTripPlannerName(String tripPlannerName) {
		this.tripPlannerName = tripPlannerName;
	}
	
	
}
