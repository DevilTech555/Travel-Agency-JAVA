package com.saarathi.services;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.saarathi.beans.ConnectionProvider;
import com.saarathi.beans.Customer;





public class LoginValidationService{

	 ConnectionProvider mycon=ConnectionProvider.getConnectionProvider();
	 Connection myconn=mycon.con;
	int count=0;

	//Customercontroller customercontroller=new CustomerController();

	

	static Scanner scanner=new Scanner(System.in);



	public void CustomerLogin() throws SQLException{  //Choice for login or Signup
		System.out.println("1:Login");
		System.out.println("2:Signup");

		int choice=0;
		
		System.out.println("Enter Your choice");
		choice=scanner.nextInt();
		switch (choice) {
		case 1:login();
		break;
		case 2:
			signup();
			break;

		default:
			System.out.println("Please Enter Valid key");
			CustomerLogin();

			break;
		}
		



	}
	
	
	void signup() throws SQLException  {       //Signup Method

		System.out.println("Enter Phone number");      
		long phno=scanner.nextLong();
		boolean check=phcheck( phno);
		if(check) {                                  //Check the given no present in database or not
			System.out.println("You are already regestered Please login");
			login();

		}
		else {
			
     	System.out.println("Enter customer Name");
			String custName=scanner.next();
			System.out.println("create new password");
			String password=scanner.next();
			System.out.println("Enter Date of Birth (yyyy/mm/dd)");
			String dob=scanner.next();
			System.out.println("Enter email");
			String email=scanner.next();
			System.out.println("Enter Address");
			String address=scanner.next();

			try {
				String idf = "select cust_id from customer";
				PreparedStatement findid = myconn.prepareStatement(idf);
				ResultSet rs1 = findid.executeQuery();
				while (rs1.next()) {
					count = rs1.getInt(1);
					
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			Customer customer=new Customer(++count,custName,dob,email,phno,address,password);

			String sql = "insert into travel_agency.customer values(?,?,?,?,?,?,?)";    //user input to the database
			PreparedStatement ps = myconn.prepareStatement(sql);
			ps.setInt(1,customer.getCustId());
			ps.setString(7, customer.getPassword());
			ps.setString(2, customer.getCustName());
			ps.setString(3, customer.getDob());
			ps.setString(4, customer.getEmail());
			ps.setLong(5, customer.getPhno());
			ps.setString(6, customer.getAddress());

			ps.executeUpdate();

			System.out.println("Successfully signdup");
			System.out.println("Your user id is: "+customer.getCustId());
			CustomerLogin();                      

		}

	}


	int cid=-1;
	String cname=null;
	boolean  validpw=false;

	public void login() throws SQLException {             //Login Method
		boolean Validph=false;

		System.out.println("Enter phone Number");
		long enterdPhno=scanner.nextLong();

		Validph=phcheck(enterdPhno);        //check phone no
		validpw=pwCheck(enterdPhno);        //check  no

		if(Validph&&validpw) {

			System.out.println("Susess");
			//customercontroller.menuList(custid);       //sending customerId to cutomercontroler menuList() method
			System.out.println("Welcome "+cname);
			
			

		}
		else {
			System.out.println("PLease enter valid phoneNo and password Or Signup");
			CustomerLogin();

		}
		



	}

	boolean  phcheck(long enterdPhno) {                  //Validating given phone no valid or not


		long checkPhno=-1;
		//boolean pwValid=false;

		try {
			String ci1 = "select exists(select phno from customer where phno="+enterdPhno+")";
			PreparedStatement findid = myconn.prepareStatement(ci1);

			ResultSet rs3 = findid.executeQuery();
			
			while (rs3.next()) {
				checkPhno=rs3.getInt(1);
				

				if(checkPhno==1) {

					return true;
				}
				else {

					return false;


				}
			}

		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}



	boolean pwCheck(long enteredPhno) {       //Validating given Password valid or not

		System.out.println("Enter password");
		String pass=scanner.next();

		String passw =null;
		boolean validpw=false;
		try {
			String ci = "select cust_id,cust_name,password  from customer where phno ="+ enteredPhno;  //getting the customer name,id password fromdatabase
			PreparedStatement findid = myconn.prepareStatement(ci);

			ResultSet rs2 = findid.executeQuery();
			while (rs2.next()) {
				cid=rs2.getInt(1);
				cname=rs2.getString(2);
				passw = rs2.getString(3);

				validpw=validatepw(pass,passw);

				if(validpw) {

					return true;
				}
				else {
					
					return false;
				}

			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}



	boolean validatepw(String pass,String passw) {    //Comparing given password with database password

		if(pass.equals(passw)) {

			return true;
		}
		return false;


	}


}
