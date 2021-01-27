package com.thinkitive;

import java.util.Comparator;

public class EmpSalaryComparator implements Comparator<Employee1> {

	@Override
	public int compare(Employee1 e1, Employee1 e2) {
		
		if(e1.getSalary() > e2.getSalary()) {
			return 1;
		} else if(e1.getSalary() < e2.getSalary())
			return -1;
		else
			return 0;
	}

}
