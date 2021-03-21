package com.saarathi.controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.saarathi.beans.TripPlanner;
import com.saarathi.service.LoginValidationService;
import com.saarathi.service.RouteTripService;
import com.saarathi.service.TourPackageService;
import com.saarathi.service.TripPlannerService;

public class CustomerController {

	public void menuList() throws SQLException {
		TripPlannerService tripPlannerService = new TripPlannerService();
		TourPackageService tourPackageService = new TourPackageService();
		RouteTripService routeTripService = new RouteTripService();
		LoginValidationService loginValidationService = new LoginValidationService();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter email:");
		String email=scanner.next();
		System.out.println("enter password:");
		String password=scanner.next();
		loginValidationService.customerLogin(email, password);
		
		int option=0;
		do {
			System.out.println("enter option to see:");
			System.out.println("1.Tour Package");
			System.out.println("2.Route Trip");
			System.out.println("3.View booked Status");
			System.out.println("4.cancellation");
			 option = scanner.nextInt();
			
			switch(option) {
			case 1:
				tourPackageService.showTourPackages();
//				System.out.println("enter tour package id to book:");
//				int tourPackageId = scanner.nextInt();
//				System.out.println("1.Tour Package");
//				System.out.println("2.Route Trip");
//				System.out.println("3.View booked Status");
//				System.out.println("4.cancellation");
				break;
			case 2:
				routeTripService.showRouteTrip();
				break;
			}
		}while(option!=0);
		
	}
}
