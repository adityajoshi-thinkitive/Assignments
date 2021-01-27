package com.thinkitive;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestEmployee {

	public static void main(String[] args) {

		Set l = new HashSet();
		Employee e1 = new Employee(1, "Sunil", 25000);
		Employee e2 = new Employee(2, "Anil", 30000);
		Employee e3 = new Employee(3, "Ram", 40000);
		Employee e4 = new Employee(1, "Sunil", 25000);

		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		System.out.println(l);
	}

}
