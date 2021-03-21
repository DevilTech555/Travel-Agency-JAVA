package com.saarathi.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.saarathi.beans.ConnectionProvider;
import com.saarathi.beans.VehicleType;




public class VehicleTypeService{
	
	ConnectionProvider mycon=ConnectionProvider.getConnectionProvider();
Connection myconn=mycon.con;


	VehicleType vehicletype=new VehicleType();
	Scanner scanner=new Scanner(System.in);
	
	
	public void addVehicletype() throws SQLException {
				
			
				
	                  //showVehicletypes();
				System.out.println("Enter vehicle typeid");
				int vehicletype_id=scanner.nextInt();
				System.out.println("Enter vehicle type Name");
				String vehicletype_name=scanner.next();
		 
				 VehicleType vehicletype=new VehicleType(vehicletype_id,vehicletype_name);

				String sql = "insert into travel_agency.vehicle_type values(?,?)";    //user input to the database
				PreparedStatement ps = myconn.prepareStatement(sql);
				ps.setInt(1,vehicletype.getVehicleTypeId());
				ps.setString(2, vehicletype.getVehicleTypeName());
				

				ps.executeUpdate();

	
}
			
			public void showVehicletypes() {
				 try {
			            String itemquery="select * from travel_agency.vehicle_type";
			            PreparedStatement finditems=myconn.prepareStatement(itemquery);
			            ResultSet rs1=finditems.executeQuery();
			            while (rs1.next()){
			                System.out.println(rs1.getInt(1)+" "+rs1.getString(2));
			        }
				 }
			            catch (Exception e){
			            e.printStackTrace();
			        }
			}
			public void deleteVehicletype (int vehicletype_id) {
		        try{
		            String idf = "delete from vehicle_type where vehicletype_id=?";
		            PreparedStatement idelete = myconn.prepareStatement(idf);
		            idelete.setInt(1,vehicletype_id);
		            idelete.executeUpdate();
		        }catch (Exception e){
		            e.printStackTrace();
		        }
	

	
	
			}
}

