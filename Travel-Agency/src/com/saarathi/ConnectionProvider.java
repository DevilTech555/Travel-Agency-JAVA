package com.saarathi;

import java.sql.*;

public class ConnectionProvider {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static private Connection singletonInstance=null;
	static final String password = "devil";
	
	static {
		try {
			singletonInstance= DriverManager.getConnection("jdbc:mysql://localhost:3306/travel-agency","root",password);
			System.out.println("conection done");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConnectionProvider() {
		if(singletonInstance!=null) {
			return singletonInstance;
		}else {
			System.out.println("single connection is not created");
		}
		return singletonInstance;
	}
	@Override
     protected Object clone() throws CloneNotSupportedException{
    	 throw new CloneNotSupportedException("No clones allowed!!");
     }
	
}