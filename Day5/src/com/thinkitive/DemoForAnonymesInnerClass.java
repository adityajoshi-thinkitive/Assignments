package com.thinkitive;

public class DemoForAnonymesInnerClass {

	public static void main(String[] args) {
		
		MyInterface add = new MyInterface() {
			
			@Override
			public int performAction(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
		};
		
		MyInterface sub = new MyInterface() {
			
			@Override
			public int performAction(int a, int b) {
				// TODO Auto-generated method stub
				return a-b;
			}
		};
		
		MyInterface multiply = new MyInterface() {
			
			@Override
			public int performAction(int a, int b) {
				// TODO Auto-generated method stub
				return a*b;
			}
		};
		MyInterface div = new MyInterface() {
			
			@Override
			public int performAction(int a, int b) {
				// TODO Auto-generated method stub
				return a/b;
			}
		};
		
		System.out.println(add.performAction(10, 4));
		System.out.println(sub.performAction(10, 4));
		System.out.println(multiply.performAction(10, 4));
		System.out.println(div.performAction(10, 4));
		
		
		
		MyInterface addbyAdiition = new Addition();
		System.out.println(addbyAdiition.performAction(10, 4));
		
		
	}
}
