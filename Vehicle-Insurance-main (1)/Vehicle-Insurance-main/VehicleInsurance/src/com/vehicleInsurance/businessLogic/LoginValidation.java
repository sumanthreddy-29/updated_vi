package com.vehicleInsurance.businessLogic;

public class LoginValidation {
	public boolean loginValidation(String email,String password) {
		if(email.equalsIgnoreCase("customer123@gmail.com") && password.equals("Customer@123"))
			return true;
		else{
			return false;
		}
	}

}
