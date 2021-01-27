package com.thinkitive.demo.threading;

public class DemoTable {

	public static void main(String[] args) {
		 
		MyTable1 m1 =  new MyTable1();
		MyTable2 m2 = new MyTable2();
		
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);
		t1.start();
		t2.start();
		
		
	}
}
