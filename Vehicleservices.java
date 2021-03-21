package com.saarathi.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.saarathi.beans.ConnectionProvider;
import com.saarathi.beans.Vehicle;




public class Vehicleservices{
	VehicleTypeService vehicletypeservice=new VehicleTypeService();	
	ConnectionProvider mycon=ConnectionProvider.getConnectionProvider();
Connection myconn=mycon.con;


	Vehicle vehicle=new Vehicle();
	Scanner scanner=new Scanner(System.in);

			public void addVehicle() throws SQLException {
				System.out.println("Enter vehicleId");
				int vehicleId=scanner.nextInt();
				System.out.println("Enter vehicle Number");
				String vehicleNumber=scanner.next();
				System.out.println("Enter vehicle typeId");
				vehicletypeservice.showVehicletypes();
				int vehicleTypeId=scanner.nextInt();
				System.out.println("Enter number of seats");
				int seats=scanner.nextInt();
				System.out.println("Enter vehicle name");
				String name=scanner.next();

				 Vehicle vehicle=new Vehicle(vehicleId,name,vehicleNumber,vehicleTypeId,seats);

				String sql = "insert into travel_agency.vehicle values(?,?,?,?,?)";    //user input to the database
				PreparedStatement ps = myconn.prepareStatement(sql);
				ps.setInt(1,vehicle.getVehicleId());
				ps.setString(2, vehicle.getName());
				ps.setString(3, vehicle.getVehicleNumber());
				ps.setInt(4, vehicle.getVehicleTypeId());
			    ps.setInt(5, vehicle.getSeats());
			    ps.executeUpdate();

	
}
			
			public void showVehicle() {
				 try {
			            String itemquery="select * from travel_agency.vehicle";
			            PreparedStatement finditems=myconn.prepareStatement(itemquery);
			            ResultSet rs1=finditems.executeQuery();
			            ResultSetMetaData metaData = rs1.getMetaData();
			            System.out.println("vehicle details fetched ");
			    		System.out.println(metaData.getColumnName(1)+" "+metaData.getColumnName(2)+" "+metaData.getColumnName(3)+" "+metaData.getColumnName(4)+" "+metaData.getColumnName(5));
			    		System.out.println("-----------------------------------------------------------------");
			            while (rs1.next()){
			            	
			                System.out.println(rs1.getInt(1)+" \t "+rs1.getString(2)+"\t"+rs1.getString(3)+"\t"+rs1.getInt(4)+"\t  "+rs1.getInt(5));
			        }
				 }
			            catch (Exception e){
			            e.printStackTrace();
			        }
			}
			public void deleteVehicletype (int vehicle_id) {
		        try{
		            String idf = "delete from vehicle where vehicle_id=?";
		            PreparedStatement idelete = myconn.prepareStatement(idf);
		            idelete.setInt(1,vehicle_id);
		            idelete.executeUpdate();
		        }catch (Exception e){
		            e.printStackTrace();
		        }
	

	
	
			}
}

