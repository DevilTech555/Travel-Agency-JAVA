package com.saarathi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionProvider {
	static private ConnectionProvider singletonInstance;
	public static Connection con=null;
	
	private ConnectionProvider() {
		//Change password occurring to your MySQL password
		final String password = "devil";

		try{  
			Class.forName("com.mysql.jdbc.Driver");  
		    con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/travel-agency","root",password); 
		    System.out.println("connection etablished");
		}catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
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
