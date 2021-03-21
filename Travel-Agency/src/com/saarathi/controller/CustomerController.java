package com.saarathi.controller;

import java.util.Scanner;

public class CustomerController {

	public void menuList(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter email:");
		String email=scanner.next();
		System.out.println("enter password:");
		String password=scanner.next();
		
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
				break;
			case 2:
				break;
			}
		}while(option!=0);
		
	}
}
