package com.thinkitive;

import java.util.ArrayList;
import java.util.Collections;
public class Practice {

	public static void main(String[] args) {
		
		MyStack<Integer> m = new MyStack<Integer>();
		
		m.push(11);
		m.push(88);
		m.push(1);
		m.push(34);
		//m.push(10.4);
		
		m.printStack();
		m.pop();
		m.printStack();
		
		MyStack<Employee> m1 = new MyStack<Employee>();
		Employee e1 = new Employee(1, "ABCD", 99);
		Employee e2 = new Employee(2, "XYZ", 89);
		Employee e3 = new Employee(3, "MNO", 66);
		Employee e4 = new Employee(1, "ABCD", 99);
		
		m1.push(e1);
		m1.push(e2);
		m1.push(e3);

		m1.printStack();
		m1.pop();
		m1.printStack();
	}
	
	
}
