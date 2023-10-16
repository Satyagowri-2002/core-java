package com.tns.thread;

public class CreateThreadFirst extends Thread {
	public void run() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateThreadFirst ob=new CreateThreadFirst();
		ob.start();//runnable state

	}

}
