package com.thinkitive;

public class Demo {
	public static void main(String[] args) {
		Address a = new Address("Kolhapur", 416122);
		Employee e = new Employee(1, "ABCD", 99, a);

		Employee temp = new Employee();

		e.doSerialize();
		System.out.println(e);
		
		temp=temp.doDeserialize();
		System.out.println(temp);
	}

}