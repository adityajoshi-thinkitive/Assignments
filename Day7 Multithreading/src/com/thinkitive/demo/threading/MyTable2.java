package com.thinkitive.demo.threading;

public class MyTable2 extends Table implements Runnable{

	Table t;
	public MyTable2() {
		// TODO Auto-generated constructor stub
	}
	public MyTable2(Table t) {
		super();
		this.t = t;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//printTable(11);
		//Table t = new Table();
		t.printNewTable(10);
	}

}
