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
import com.saarathi.beans.TourPackage;

public class TourPackageService {
	static Connection c=ConnectionProvider.getConnectionProvider();
	
	public void showTourPackages() throws SQLException {
		List<TourPackage> tourPackages=new ArrayList<TourPackage>();
		TourPackage tourPackage = new TourPackage();
		String query = "select * from tour_package";
		PreparedStatement pstmt = c.prepareStatement(query);
//		pstmt.setInt(1, tripPlannerId);
		ResultSet rs = pstmt.executeQuery();
		ResultSetMetaData metaData = rs.getMetaData();

		while(rs.next()) {
			tourPackage.setTour_id(rs.getInt("tour_id"));
			tourPackage.setPackageName(rs.getString("package_name"));
			tourPackage.setNoOfDays(rs.getInt("noofdays"));
			tourPackage.setPackagePricing(rs.getDouble("package_pricing"));
			
			tourPackages.add(tourPackage);
		}
		System.out.println("tour packages fetched ");
		System.out.println(metaData.getColumnName(1)+"\t"+metaData.getColumnName(2)+"\t"+metaData.getColumnName(3)+"\t"+metaData.getColumnName(4));
		System.out.println("-----------------------------------------------------------------");
		for(TourPackage eachRoute:tourPackages) {
			System.out.println(eachRoute.getTour_id() +"\t"+ eachRoute.getPackageName()+"\t\t"+eachRoute.getNoOfDays()+"\t\t"+eachRoute.getPackagePricing());
		}
	}
}
