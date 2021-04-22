package com.vehicleInsurance.Controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.vehicleInsurance.dao.VehicleDao;
import com.vehicleInsurance.model.Customer;

public class InsuranceController {
	
	public void insuranceController(Customer customer) throws SQLException {
		Scanner sc = new Scanner(System.in);
		VehicleDao vehicleDao = new VehicleDao();
		
		System.out.println("Please select the option given below:");
		System.out.println("1. Bike Insurance");
		System.out.println("2. Car Insurance");
		int n = sc.nextInt();
//		Customer c = new Customer();
//		c.setEmail(null);
		
		if(n>2 || n<1) {
			System.out.println("Enter the correct choice :)");
//			insuranceController();
			insuranceController(customer);
		}
		else {
			if(n==1) {
				BikeInsurance b = new BikeInsurance();
				b.bikeInsurance(customer);
				
			}
			else {
				CarInsurance ci = new CarInsurance();
				ci.carInsurance(customer);
			}
		}
		
	}

}
