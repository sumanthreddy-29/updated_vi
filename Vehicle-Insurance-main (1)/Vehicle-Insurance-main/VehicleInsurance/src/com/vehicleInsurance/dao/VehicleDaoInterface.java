package com.vehicleInsurance.dao;

import java.sql.SQLException;

import com.vehicleInsurance.businessLogic.InsurancePolicy;
import com.vehicleInsurance.model.VehicleDetails;

public interface VehicleDaoInterface {
	public void vehicleDetailsInfo(VehicleDetails vehicleDetails) throws SQLException; 

}
