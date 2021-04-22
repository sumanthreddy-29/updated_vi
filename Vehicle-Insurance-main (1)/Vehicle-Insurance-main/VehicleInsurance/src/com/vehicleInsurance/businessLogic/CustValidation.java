package com.vehicleInsurance.businessLogic;

import java.util.Scanner;

import com.vehicleInsurance.Controller.BikeInsurance;
import com.vehicleInsurance.Controller.CarInsurance;
import com.vehicleInsurance.model.Customer;

public class CustValidation implements CustValidationInterface{
	
	public boolean validateAadhar(long aaNum)  {
		int l = (int) Long.toString(aaNum).length();
		
			if (l==12) {
				return true;
			} else {
				return false;
			}

	}
	public void bikeORcar(Customer c) {
		int e;
		long aaNum;

		Scanner sc = new Scanner(System.in);
		System.out.println("Select 1.Bike or 2.Car");
		e = sc.nextInt();
		if (e == 1) {

			/*
			 * System.out.println("Enter Aadhar Number:"); aaNum = sc.nextLong();
			 * b.setAaNum(aaNum);
			 */
			aaNum = c.getAaNum();
			System.out.println(aaNum);

		} else if (e == 2) {

			aaNum = c.getAaNum();
		}
		else {
			System.out.println("false");
		}
		

	}

}
