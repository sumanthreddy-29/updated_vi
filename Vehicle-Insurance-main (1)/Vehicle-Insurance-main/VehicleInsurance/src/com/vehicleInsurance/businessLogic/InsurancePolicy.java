package com.vehicleInsurance.businessLogic;

public class InsurancePolicy {
		
		public double premiumInsurance(long amt) {
			
			double yAmt = amt*12/100;
			double emip = yAmt/12;
			return emip;
		}
		
		public double regularInsurance(long amt) {
			double yAmt = amt*9/100;
			double emir = yAmt/12;
			return emir;
		}

}
