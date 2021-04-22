package com.vehicleInsurance.dao;

import java.sql.SQLException;

import com.vehicleInsurance.model.Customer;

public interface SignInDaoInterface {
	
	 boolean Customerlogin(Customer customer) throws SQLException;

}
