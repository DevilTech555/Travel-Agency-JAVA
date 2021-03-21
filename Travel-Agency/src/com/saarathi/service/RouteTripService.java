package com.saarathi.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.saarathi.ConnectionProvider;
import com.saarathi.beans.RouteTrip;


public class RouteTripService {
	static Connection c=ConnectionProvider.getConnectionProvider();

	public void showRouteTrip() throws SQLException {
		List<RouteTrip> routeTrips=new ArrayList<RouteTrip>();
		RouteTrip tourPackage = new RouteTrip();
		String query = "select * from route_trip";
		PreparedStatement pstmt = c.prepareStatement(query);
//		pstmt.setInt(1, tripPlannerId);
		ResultSet rs = pstmt.executeQuery();
		ResultSetMetaData metaData = rs.getMetaData();
		while(rs.next()) {
			tourPackage.setRouteId(rs.getInt("route_id"));
			tourPackage.setRouteName(rs.getString("route_name"));
			tourPackage.setFrom(rs.getString("from"));
			tourPackage.setTo(rs.getString("to"));
			tourPackage.setDeparture(rs.getString("departure"));
			tourPackage.setArrival(rs.getString("arrival"));
			tourPackage.setPricing(rs.getDouble("pricing"));
			tourPackage.setSeat_availability(rs.getInt("seat_availability"));
			
			routeTrips.add(tourPackage);
		}
		System.out.println("Route Trips are fetched ");
		System.out.println(metaData.getColumnName(1)+"\t"+metaData.getColumnName(2)+"\t"+metaData.getColumnName(3)+"\t\t"+metaData.getColumnName(4)+"\t"+metaData.getColumnName(5)+"\t"+metaData.getColumnName(6)+"\t\t"+metaData.getColumnName(7)+"\t\t"+metaData.getColumnName(8));
		System.out.println("---------------------------------------------------------------------------------------------------------------------------");
		for(RouteTrip eachRoute:routeTrips) {
			System.out.println(eachRoute.getRouteId() +"\t\t"+ eachRoute.getRouteName()+"\t\t"+eachRoute.getFrom()+"\t"+eachRoute.getTo()+"\t"+eachRoute.getDeparture()+"\t"+
		eachRoute.getArrival()+"\t"+eachRoute.getPricing()+"\t\t"+eachRoute.getSeat_availability());
		}
		
	}
}
