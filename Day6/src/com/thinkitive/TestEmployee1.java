package com.thinkitive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class TestEmployee1 {

	public static void main(String[] args) {
		
		Address a1 = new Address("Kolhapur", 416122);
		Employee1 e1 = new Employee1(100, "Sunil", 25000, a1);
		
		Address a2 = new Address("Mumbai", 422122);
		Employee1 e2 = new Employee1(23, "Anil", 30000, a2);
		
		Address a3 = new Address("Parbhani", 416134);
		Employee1 e3 = new Employee1(333, "Ram", 40000, a3);
		
		Address a4 = new Address("Thane", 434550);
		Employee1 e4 = new Employee1(100, "Sham", 15000, a4);
		
		List<Employee1> list = new LinkedList<Employee1>();

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		System.out.println(list);

		Collections.sort(list);
		System.out.println(list);
		
		EmpSalaryComparator sal = new EmpSalaryComparator();
		EmpNameComparator name = new EmpNameComparator();
//		Collections.sort(list, name);
//		System.out.println(list);
//		Collections.sort(list, sal);
//		System.out.println(list);
		
		ListIterator<Employee1> empitr = list.listIterator();
		while(empitr.hasNext()) {
			System.out.println(empitr.next());
		}
		
		System.out.println("In Reverse");
		
		while(empitr.hasPrevious()) {
			System.out.println(empitr.previous());
		}
		
	}
}
