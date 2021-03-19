package com.saarathi.beans;

public class RouteTrip {
	private int routeId;
	private String routeName;
	private String from;
	private String to;
	private String departure;
	private String arrival;
	private double pricing;
	private int seat_availability;
	private int tripPlannerId;
	public RouteTrip(int routeId, String routeName, String from, String to, String departure, String arrival,
			double pricing, int seat_availability, int tripPlannerId) {
		super();
		this.routeId = routeId;
		this.routeName = routeName;
		this.from = from;
		this.to = to;
		this.departure = departure;
		this.arrival = arrival;
		this.pricing = pricing;
		this.seat_availability = seat_availability;
		this.tripPlannerId = tripPlannerId;
	}
	public RouteTrip() {
		super();
	}
	public int getRouteId() {
		return routeId;
	}
	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}
	public String getRouteName() {
		return routeName;
	}
	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public double getPricing() {
		return pricing;
	}
	public void setPricing(double pricing) {
		this.pricing = pricing;
	}
	public int getSeat_availability() {
		return seat_availability;
	}
	public void setSeat_availability(int seat_availability) {
		this.seat_availability = seat_availability;
	}
	public int getTripPlannerId() {
		return tripPlannerId;
	}
	public void setTripPlannerId(int tripPlannerId) {
		this.tripPlannerId = tripPlannerId;
	}
	
	
	
}
