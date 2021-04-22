package com.vehicleInsurance.Controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.vehicleInsurance.businessLogic.LoginValidation;
import com.vehicleInsurance.dao.SignInDao;
import com.vehicleInsurance.model.Customer;

public class SignInController {
	static SignInDao signInDao = new SignInDao();
	public static void loginDetails() throws SQLException {
		System.out.println("Login Credintials");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserID:");
		String userId = sc.nextLine();
		System.out.println("Enter Password:");
		String pwd = sc.nextLine();
		
		 Customer customer = new Customer();
		    customer.setEmail(userId);
		    customer.setPassword(pwd);
		    boolean cusLogin =  signInDao.Customerlogin(customer);
//		LoginValidation lv = new LoginValidation();
//		boolean val = lv.loginValidation(userId,pwd);
		if(cusLogin) {
			System.out.println("=================Successfully completed Sign-In====================");
			InsuranceController icsi = new InsuranceController();
			icsi.insuranceController(customer);
		
		}
		else {
			System.out.println("Please enter the correct values :)");
			loginDetails();
		}
		
	}
//	public static void main(String[] args) throws SQLException {
//		loginDetails();
//	}

}
