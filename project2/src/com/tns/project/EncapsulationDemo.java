package com.tns.project;

public class EncapsulationDemo {
	public static void main(String[] args) {
		Encapsulation ob=new Encapsulation();//create object
		ob.serialno=47;//accessing the data member by using dot operator
		ob.name="satya";
		ob.age=21;
		ob.show();
	}
}
