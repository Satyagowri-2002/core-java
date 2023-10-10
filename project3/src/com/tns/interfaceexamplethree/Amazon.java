package com.tns.interfaceexamplethree;
import java.util.*;
public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount;
		Scanner sg=new Scanner(System.in);
		System.out.println("enter amount");
		amount=sg.nextInt();
		Accounts a;
		a=new NonPrime(amount);
		a.deliverycharges(amount);
	}
}

		

