package com.tns.absraction;
//program to demonstrate abstraction in java
//Abstract class
public abstract class Shape {
	protected float area;
	//Abstract method
	abstract void calArea();
	void show() {//concrte method
		System.out.println("area of shape is "+area);	}
	

}
