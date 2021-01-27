package com.thinkitive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SortEmployee {

	public static void main(String[] args) {

		Employee e1 = new Employee(100, "Sunil", 25000);
		Employee e2 = new Employee(23, "Anil", 30000);
		Employee e3 = new Employee(333, "Ram", 40000);
		Employee e4 = new Employee(100, "Sham", 15000);

		List<Employee> list = new ArrayList<Employee>();

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		System.out.println(list);

		Collections.sort(list);
		System.out.println(list);
		
		EmpSalaryComparator sal = new EmpSalaryComparator();
		EmpNameComparator name = new EmpNameComparator();
		Collections.sort(list, name);
		System.out.println(list);
		Collections.sort(list, sal);
		System.out.println(list);
		
	}
}
