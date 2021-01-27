package com.thinkitive;

import java.util.Comparator;

public class EmpNameComparator implements Comparator<Employee1> {
	@Override
	public int compare(Employee1 e1, Employee1 e2) {
		
		return e1.getName().compareTo(e2.getName());
	}

}