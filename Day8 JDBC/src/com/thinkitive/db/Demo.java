package com.thinkitive.db;

public class Demo {
	public static void main(String[] args) {

		MyDatabaseOperations ops = new MyDatabaseOperations();

		ops.insertEmp(10, "Aditya");
		ops.deleteEmp(4);
		ops.updateEmp(3, "Superman");
		ops.displayEmp();
	}

}