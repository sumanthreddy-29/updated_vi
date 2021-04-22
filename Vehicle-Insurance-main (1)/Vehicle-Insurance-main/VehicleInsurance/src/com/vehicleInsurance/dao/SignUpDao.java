package com.vehicleInsurance.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.vehicleInsurance.dbconn.ConnectionManagerMysql;
import com.vehicleInsurance.model.Customer;

public class SignUpDao implements SignUpDaoInterface {

	@Override
	public int CustomerSignUp(Customer customer) throws SQLException {
//		// TODO Auto-generated method stub
//		return 0;
		
		String CusSignup = "INSERT INTO customer VALUES (?,?,?,?,?,?,?)";

		Connection c = null;
		c = ConnectionManagerMysql.connectToSql();
		//access the string
		PreparedStatement ps = c.prepareStatement(CusSignup);
		ps.setString(1, customer.getCustName());
		ps.setLong(2, customer.getMobNum());
		ps.setString(3,customer.getCity());
		ps.setInt(4,customer.getPincode());
		ps.setLong(5, customer.getSalary());
		ps.setString(6,customer.getEmail());
		ps.setString(7,customer.getPassword());
		
		
		int execution = ps.executeUpdate();
		//System.out.println(execution);
		return execution;
		
	}
	
	
	

}
