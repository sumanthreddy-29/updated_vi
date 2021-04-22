package com.vehicleInsurance.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.vehicleInsurance.dbconn.ConnectionManagerMysql;
import com.vehicleInsurance.model.Customer;

public class SignInDao implements SignInDaoInterface {

	@Override
	public boolean Customerlogin(Customer customer) throws SQLException {
		// TODO Auto-generated method stub
		
		
		Connection con = ConnectionManagerMysql.connectToSql();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM CUSTOMER");
		//System.out.println("sql table select ....");
		while(rs.next())
		{
			String email = rs.getString(6);
			String password = rs.getString(7);
//			System.out.println("sql table ....");
//			System.out.println(email);
//			System.out.println(password);
//			System.out.println(customer.getEmail());
//			System.out.println(customer.getPassword());
			if(email.equalsIgnoreCase(customer.getEmail()) && password.equals(customer.getPassword())) {
				System.out.println("Credenentials Matching");
				return true;
			}
		}
		
		return false;
	}
	}
	
	


