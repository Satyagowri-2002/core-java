package com.tns.overide;

public class Sbi extends Rbi {
	public float getRateofInterest() {
		
		System.out.println(super.getRateofInterest());
		return 5.5f;
	}

}
