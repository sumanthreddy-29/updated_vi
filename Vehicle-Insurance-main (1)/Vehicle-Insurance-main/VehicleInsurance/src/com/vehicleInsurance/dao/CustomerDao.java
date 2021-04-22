package com.vehicleInsurance.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.vehicleInsurance.dbconn.ConnectionManagerMysql;
import com.vehicleInsurance.model.Customer;

public class CustomerDao {
	public Customer FiltercustomerByEmail(String email) throws SQLException {
		Customer customer = new Customer();
		Connection con = ConnectionManagerMysql.connectToSql();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM customer");
		int d =1;
		System.out.println();
		email = email.toLowerCase();
		while(rs.next())
		{
			if(rs.getString(6).equals(email)) {
				customer.setCustName(rs.getString(1));
				customer.setMobNum(rs.getLong(2));
				customer.setCity(rs.getString(3));
				customer.setPincode(rs.getInt(4));
				customer.setSalary(rs.getLong(5));
				customer.setEmail(rs.getString(6));
				customer.setPassword(rs.getString(7));
				
			}
		}
		
		return customer;
	}

}
