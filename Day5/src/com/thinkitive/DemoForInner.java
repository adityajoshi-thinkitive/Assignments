package com.thinkitive;

import com.thinkitive.Outer.Inner;
import com.thinkitive.Outer.InnerStatic;
import com.thinkitive.Outer.InnerStatic2;

public class DemoForInner extends InnerStatic2 {

	void demo() {
		super.demo();
		System.out.println("Inheirted Innerstatic2");
		
	}
	public static void main(String[] args) {
		
		Outer o = new Outer();
		Inner i = o.new Inner();
		InnerStatic is = new InnerStatic();
		i.demo();
		is.demo();
		DemoForInner dfi = new DemoForInner();
		dfi.demo();
	}
	
}
