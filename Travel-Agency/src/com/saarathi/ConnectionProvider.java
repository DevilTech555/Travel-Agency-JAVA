package com.saarathi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionProvider {
	static private ConnectionProvider singletonInstance;
	public static Connection con=null;
	
	private ConnectionProvider() {

		try{  
			Class.forName("com.mysql.jdbc.Driver");  
		    con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/travel-agency","root","Tiger"); 
		    System.out.println("connection etablished");
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
	}
	
	public static synchronized ConnectionProvider connectionProvider() {
		if(null==singletonInstance) {
			singletonInstance=new ConnectionProvider();
		}
		return singletonInstance;
	}
	
}
