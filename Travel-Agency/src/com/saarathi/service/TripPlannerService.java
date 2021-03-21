package com.saarathi.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.saarathi.ConnectionProvider;

public class TripPlannerService {
	static Connection c=ConnectionProvider.getConnectionProvider();
	static Scanner scan= new Scanner(System.in);
	public void showTripPlan() throws SQLException {
		String query = "select * from trip_planner";
		PreparedStatement pstmt = c.prepareStatement(query);
//		pstmt.setInt(1, tripPlannerId);
		ResultSet rs = pstmt.executeQuery();
		System.out.println("trip plan fetched");
		
		System.out.println("enter option to see:");
		System.out.println("1.Tour Package");
		System.out.println("2.Route Trip");
		int option = scan.nextInt();
		switch(option) {
		case 1:
			
		}
	}
	
}
