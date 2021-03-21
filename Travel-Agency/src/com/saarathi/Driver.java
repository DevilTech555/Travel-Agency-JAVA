package com.saarathi;

import java.sql.SQLException;
import java.util.Scanner;
import com.saarathi.controller.CustomerController;


public class Driver {
	static Scanner scan= new Scanner(System.in);
	public static void main(String[] args) throws SQLException {
		
		System.out.println("Enter your choice:");
		System.out.println("1.Admin");
		System.out.println("2.Customer");
		int choice = scan.nextInt();
		switch(choice) {
		case 1:
//			System.out.println("Enter Admin password");
//			String adminPassword=scan.next();
		case 2: 
			CustomerController customerController = new CustomerController();
			customerController.menuList();
			
		}
	}

}
