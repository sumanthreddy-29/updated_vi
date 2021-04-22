package com.vehicleInsurance.model;

public class Customer {
	private String custName;
	private long mobNum;
	//private int age;
	private String city;
	private int pincode;
	private long salary;
	private long aaNum;
	private String regNum;
	private String email;
	private String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public long getMobNum() {
		return mobNum;
	}
	public void setMobNum(long mobNum) {
		this.mobNum = mobNum;
	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getRegNum() {
		return regNum;
	}
	

	public long getAaNum() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void setRegNum(String regNum) {
		// TODO Auto-generated method stub
		this.regNum = regNum;
	}
	public void setAaNum(long aaNum) {
		// TODO Auto-generated method stub
		this.aaNum = aaNum;
	}

}
