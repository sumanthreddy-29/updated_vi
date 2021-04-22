package com.vehicleInsurance.model;

public class Insurance {
	
	private int insuranceId;
	private String customerId;
	private String vehicleType;
	private String insuranceType;
	private int monthlyPremium;
	public int getInsuranceId() {
		return insuranceId;
	}
	public void setInsuranceId(int insuranceId) {
		this.insuranceId = insuranceId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getInsuranceType() {
		return insuranceType;
	}
	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}
	public int getMonthlyPremium() {
		return monthlyPremium;
	}
	public void setMonthlyPremium(int monthlyPremium) {
		this.monthlyPremium = monthlyPremium;
	}

}
