package com.vehicleInsurance.model;

public class VehicleDetails {
	
	private String vehicle_RC;
	private String customer_Id;
	private long aaNum;
	private String license_Num;
	public String getVehicle_RC() {
		return vehicle_RC;
	}
	public void setVehicle_RC(String vehicle_RC) {
		this.vehicle_RC = vehicle_RC;
	}
	public String getCustomer_Id() {
		return customer_Id;
	}
	public void setCustomer_Id(String customer_Id) {
		this.customer_Id = customer_Id;
	}
	public long getAaNum() {
		return aaNum;
	}
	public void setAaNum(long aaNum) {
		this.aaNum = aaNum;
	}
	public String getLicense_Num() {
		return license_Num;
	}
	public void setLicense_Num(String license_Num) {
		this.license_Num = license_Num;
	}
	

}




//use vehicle_Insurance;
//
//create table Customer(
//cName varchar(20) NOT NULL, pNumber bigint(10) NOT NULL, city varchar(15),
//pincode int(6), salary bigint(12), custId varchar(30),
//password varchar(15) NOT NULL, primary key(custId)
//);
//
//insert into Customer values('Sumanth',9182976490,'Chennai',600096,600000,'sumanth@29','sumanth@29');
//
//select * from Customer;
//
//desc customer;
