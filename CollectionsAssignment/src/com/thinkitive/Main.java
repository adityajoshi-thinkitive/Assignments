package com.thinkitive;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Set<String> auth1 = new HashSet<String>();
		auth1.add("Aditya Joshi");
		Book bk1 = new Book(101, "Who moved my cheese", auth1, 400.00);
		
		Set<String> auth2 = new HashSet<String>();
		auth2.add("J.K Rowling");
		auth2.add("R.R.Martin");
		Book bk2 = new Book(102, "Harry Potter and Dance of Dragons", auth2, 5000.00);
		
		Set<String> auth3 = new HashSet<String>();
		auth3.add("P.L.Deshpande");
		Book bk3 = new Book(103, "Vyakti ani Valli", auth3, 300.00);
		
		Set<String> auth4 = new HashSet<String>();
		auth4.add("Silberschatz");
		auth4.add("Korth");
		auth4.add("Sudarshan");
		Book bk4 = new Book(104, "Database System Concepts", auth4, 850.00);
		
		StoreUtil su = new StoreUtil();
		su.addRecords(bk1);
		su.addRecords(bk2);
		su.addRecords(bk3);
		su.addRecords(bk4);
		
		System.out.println("No of Books: "+su.getNumOfRecords());
		
		System.out.println("\nList Of books");
		PrintUtil.getRecords(su);
		
		SortUtils.sortByName(su.getRecords());
		System.out.println("\n Books sorted by name");
		PrintUtil.getRecords(su);
		
		SortUtils.sortByPrice(su.getRecords());
		System.out.println("\n Books sorted by price");
		PrintUtil.getRecords(su);
	}
}
