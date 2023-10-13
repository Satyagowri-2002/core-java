package com.tns.exceptions;
//program to demonstrate nestedtry block
public class NestedTry {
	public static void check() {
		String str="tns";
		int slength=str.length();
		System.out.println("the length is"+slength);
		String anotherstring="hello";
		int s1=anotherstring.length();
		int y=6;
		int arr[]=null;
		try {//outer try
			int s=arr[1];
			int z=y/0;
			try {//inner try
				System.out.println(str.charAt(y));
				}
			catch(StringIndexOutOfBoundsException ex) {
				System.out.println("Index out of bpound"+ex.getMessage());
			}
				
			}
		catch(NullPointerException ex) {
			System.out.println("null pointer exception"+ex.getMessage());
		}
		catch(ArithmeticException ex) {//outer catch
			System.out.println("Arithmetic exception"+ex.getMessage());
		}
	}
	
}


