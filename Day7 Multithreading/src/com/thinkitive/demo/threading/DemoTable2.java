package com.thinkitive.demo.threading;

public class DemoTable2 {

	public static void main(String[] args) {
		 
		Table t = new Table();
		MyTable1 m1 =  new MyTable1(t);
		MyTable2 m2 = new MyTable2(t);
		
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);
		t1.setName("Thread1");
		t2.setName("Thread2");
		//t2.setPriority(10);
		t1.start();
		t2.start();
		
		
	}
}
