package com.thinkitive.demo.threading;

public class DemoMyThread {

	public static void main(String[] args) {
		
		MyThread m = new MyThread(); //Runnable Target
		Thread t1 = new Thread(m);
		Thread t2 = new Thread(m);
		
		t1.start();
		t2.start();
		
	}
	
}
