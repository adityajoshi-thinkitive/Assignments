package com.thinkitive.demo.threading;

public class MyTable1 implements Runnable{

	Table t;
	
	public MyTable1() {
		// TODO Auto-generated constructor stub
	} 
	
	public MyTable1(Table t) {
		super();
		this.t = t;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//printTable(10);;
		t.printNewTable(10);
	}

}
