package com.thinkitive;

public class Outer {

	private int data;

	class Inner {

		void demo() {
			System.out.println("Simple inner class");
		}
	}
	
	static class InnerStatic{
		
		void demo() {
			System.out.println("Static inner class");
		}
	}
	
	static class InnerStatic2{
		
		void demo() {
			System.out.println("Static inner2 class");
		}
	}
}
