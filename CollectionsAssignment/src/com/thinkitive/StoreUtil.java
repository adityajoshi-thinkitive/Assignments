package com.thinkitive;

import java.util.ArrayList;
import java.util.List;

public class StoreUtil<T> {

	List records = new ArrayList<T>();
	
	public void addRecords(T book) {
		records.add(book) ;
	}
	
	public List getRecords() {
		return records;
	}
	
	public int getNumOfRecords() {
		return records.size();
	}
}