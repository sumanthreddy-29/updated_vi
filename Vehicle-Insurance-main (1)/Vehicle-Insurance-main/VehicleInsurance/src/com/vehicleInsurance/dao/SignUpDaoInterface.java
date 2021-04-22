package com.vehicleInsurance.dao;

import java.sql.SQLException;

import com.vehicleInsurance.model.Customer;

public interface SignUpDaoInterface {
	
	int CustomerSignUp(Customer customer) throws SQLException;

}
