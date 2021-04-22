package com.vehicleInsurance.businessLogic;

import com.vehicleInsurance.model.Customer;

public interface CustValidationInterface {
	public boolean validateAadhar(long aaNum);
	public void bikeORcar(Customer c);

}
