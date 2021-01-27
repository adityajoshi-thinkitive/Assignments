package com.thinkitive.demo.threading;

public class Table {

	public synchronized static void printTable(int i) {
		for (int j = 1; j <= 10; j++) {
			System.out.println(i * j);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public synchronized void printNewTable(int i) {
		for (int j = 1; j <= 10; j++) {
			Thread t = Thread.currentThread();
			System.out.println(t.getName() + " : " + i * j);

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
