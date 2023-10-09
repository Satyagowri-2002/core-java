package com.tns.interfaceexamplethree;

public class NonPrime implements Accounts {
	int amount;
	

	public NonPrime() {
		super();
	}


	public NonPrime(int amount) {
		super();
		this.amount = amount;
	}
	


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	@Override
	public void deliverycharges(int amount) {
		// TODO Auto-generated method stub
	System.out.println("the amount is"+amount);	
	}
	

}
