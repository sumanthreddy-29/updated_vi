package com.vehicleInsurance.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.vehicleInsurance.businessLogic.InsurancePolicy;
import com.vehicleInsurance.dbconn.ConnectionManagerMysql;
import com.vehicleInsurance.model.VehicleDetails;

public class VehicleDao implements VehicleDaoInterface{

	@Override
	public void vehicleDetailsInfo(VehicleDetails vehicleDetails) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = ConnectionManagerMysql.connectToSql();  //connection establishment
//		Statement st = con.createStatement();
//		ResultSet rs = st.executeQuery("SELECT * FROM insurance_policy");
//		VehicleDetails vehicleDetails = new VehicleDetails();
		String insurancePolicyDetailsInsert = "INSERT INTO vehicleInfo VALUES (?,?,?,?)";
		

		PreparedStatement ps = con.prepareStatement(insurancePolicyDetailsInsert);
		ps.setString(1, vehicleDetails.getVehicle_RC());
		ps.setString(2, vehicleDetails.getCustomer_Id());
		ps.setLong(3,vehicleDetails.getAaNum());
		ps.setString(4,vehicleDetails.getLicense_Num());
		
	
		
		
		int execution = ps.executeUpdate();
		if(execution >0) {
			System.out.println("Inserted succesfully");
		}
		
		
	}

}
