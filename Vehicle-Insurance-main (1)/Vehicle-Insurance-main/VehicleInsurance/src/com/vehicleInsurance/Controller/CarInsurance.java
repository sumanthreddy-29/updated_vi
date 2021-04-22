package com.vehicleInsurance.Controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.vehicleInsurance.businessLogic.CustValidation;
import com.vehicleInsurance.businessLogic.InsurancePolicy;
import com.vehicleInsurance.businessLogic.SalaryValidaton;
import com.vehicleInsurance.dao.VehicleDao;
import com.vehicleInsurance.model.Customer;
import com.vehicleInsurance.model.VehicleDetails;

public class CarInsurance {
	String regNum,userId,license;
	 long aaNum;
	 VehicleDao vehicleDao = new VehicleDao();
	 
	public void carInsurance(Customer customer2) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		int d;
	Customer customer = new Customer();
		
		VehicleDetails vd = new VehicleDetails();
		 CustValidation cn = new CustValidation();
		 
		System.out.println("Enter Aadhar number");
		userId = customer.getEmail();
		aaNum = sc.nextLong();
		sc.nextLine();
		boolean v = cn.validateAadhar(aaNum);
		 if(v) {
			 System.out.println("Enter Vehicle RC");
				regNum = sc.nextLine();
				System.out.println("Enter UserId: ");
				userId = sc.nextLine();
			 	System.out.println("Enter the License Number : ");
			 	license = sc.nextLine();
				vd.setVehicle_RC(regNum);
				vd.setCustomer_Id(userId);
				vd.setAaNum(aaNum);
				vd.setLicense_Num(license);
				
		 }

		
		
		 
		 
		 if(cn.validateAadhar(aaNum)) {
			 System.out.println("Please select the bike membership: ");
			 System.out.println("1. Premium membership");
			 System.out.println("2. Regular membership");
			 
			 
			 
			 d=sc.nextInt();
			 System.out.println("Enter the amount of vehicle: ");
			 long amount = sc.nextLong();
			 InsurancePolicy s = new InsurancePolicy();
			 if(d==1) {
				 System.out.println("Monthly EMI for your Premium Insurance: ");
				double monthlyPre= s.premiumInsurance(amount);
				System.out.println(monthlyPre);
				
//				
			 }
			 else if(d==2) {
				 System.out.println("Monthly EMI for your Regular Insurance: ");
				double monthlyReg = s.regularInsurance(amount);
				System.out.println(monthlyReg);
				System.out.println("The membership is for one year");
//				 
//				 
			 }
			 else {
				 System.out.println("Enter the correct Insurance choice :)");
				 carInsurance(customer);
			 }
			 
			 
		 }
		 else {
			 System.out.println("Enter the correct Aadhar Number");
			 carInsurance(customer);
			 
		 }
		 
		 vehicleDao.vehicleDetailsInfo(vd);
		 
		
	}
	
		
	

}
