package com.vehicleInsurance.Controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.vehicleInsurance.model.Customer;



public class Main {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("================================Welcome to XYZ insurance company====================================         ");
		Customer c = new Customer();
		System.out.println("Select the option below:");
		System.out.println("1. New Customer");
		System.out.println("2. Existing cutomer");
		int n = sc.nextInt();
		if(n==1) {
			SignUpController suc = new SignUpController();
			suc.signUpDetails();
			
		}
		else if(n==2) {
			SignInController sic = new SignInController();
			sic.loginDetails();
		}
		else if(n==3) {
			PolicyTerms pt = new PolicyTerms();
			pt.policyTerms();
		}
		
		else {
			System.out.println("Invalid Input");
			
		}
		
		/*System.out.println("Enter the details: ");
		
		System.out.println("Enter the name: ");
		String name = sc.nextLine();
		System.out.println("Enter the mobile number: ");
		Long mobNum = sc.nextLong();
		System.out.println("Enter the age:");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the city: ");
		String city = sc.nextLine();
		System.out.println("Enter the pincode: ");
		int pincode = sc.nextInt();
		System.out.println("Enter the salary: ");
		double salary = sc.nextDouble();
		c.setCustName(name);
		c.setMobNum(mobNum);
		c.setAge(age);
		c.setCity(city);
		c.setPincode(pincode);
		c.setSalary(salary);*/
	//	System.out.println(c.getCustName());
		
		
		
	}

}