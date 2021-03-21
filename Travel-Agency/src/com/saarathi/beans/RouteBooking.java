package com.saarathi.beans;

public class RouteBooking {
	private int id;
	private int route_id;
	private int noOfseates;
	public RouteBooking(int id, int route_id, int noOfseates) {
		super();
		this.id = id;
		this.route_id = route_id;
		this.noOfseates = noOfseates;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRoute_id() {
		return route_id;
	}
	public void setRoute_id(int route_id) {
		this.route_id = route_id;
	}
	public int getNoOfseates() {
		return noOfseates;
	}
	public void setNoOfseates(int noOfseates) {
		this.noOfseates = noOfseates;
	}
	@Override
	public String toString() {
		return "RouteBooking [id=" + id + ", route_id=" + route_id + ", noOfseates=" + noOfseates + "]";
	}
}
