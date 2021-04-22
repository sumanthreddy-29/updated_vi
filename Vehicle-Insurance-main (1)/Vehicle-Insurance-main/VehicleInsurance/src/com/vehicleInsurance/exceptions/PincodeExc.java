package com.vehicleInsurance.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.vehicleInsurance.model.Customer;

public class PincodeExc {
	Scanner sc = new Scanner(System.in);
	public int pincodeExc( ) throws InputMismatchException {
//		Customer c = new Customer();
		int pincode = 0;
		System.out.println("Enter your pincode: ");
		try {  
		  pincode = sc.nextInt();
		}catch(InputMismatchException IME){
			System.out.println("Invalid input");
//			pincodeExc( );
			
		}
		
		return pincode;

	}

}
