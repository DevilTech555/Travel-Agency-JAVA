package com.saarathi.beans;

import java.sql.Timestamp;

public class RouteTrip {
	private int id;
	private String name;
	private String from;
	private String to;
	private Timestamp departure;
	private Timestamp arrival;
	private float price;
	private int seatAvalibality;
	private int trip_planner_id;
	public RouteTrip(int id, String name, String from, String to, Timestamp departure, Timestamp arrival, float price,
			int seatAvalibality, int trip_planner_id) {
		super();
		this.id = id;
		this.name = name;
		this.from = from;
		this.to = to;
		this.departure = departure;
		this.arrival = arrival;
		this.price = price;
		this.seatAvalibality = seatAvalibality;
		this.trip_planner_id = trip_planner_id;
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
	public Timestamp getDeparture() {
		return departure;
	}
	public void setDeparture(Timestamp departure) {
		this.departure = departure;
	}
	public Timestamp getArrival() {
		return arrival;
	}
	public void setArrival(Timestamp arrival) {
		this.arrival = arrival;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getSeatAvalibality() {
		return seatAvalibality;
	}
	public void setSeatAvalibality(int seatAvalibality) {
		this.seatAvalibality = seatAvalibality;
	}
	public int getTrip_planner_id() {
		return trip_planner_id;
	}
	public void setTrip_planner_id(int trip_planner_id) {
		this.trip_planner_id = trip_planner_id;
	}
	@Override
	public String toString() {
		return "RouteTrip [id=" + id + ", name=" + name + ", from=" + from + ", to=" + to + ", departure=" + departure
				+ ", arrival=" + arrival + ", price=" + price + ", seatAvalibality=" + seatAvalibality
				+ ", trip_planner_id=" + trip_planner_id + "]";
	}
}
