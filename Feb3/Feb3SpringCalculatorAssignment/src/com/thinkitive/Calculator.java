package com.thinkitive;

import org.springframework.stereotype.Service;

@Service
public class Calculator {

	public Calculator() {
		// TODO Auto-generated constructor stub
	}
	public Integer add(Integer a, Integer b) {
		return a+b;
	}
	public Integer sub(Integer a, Integer b) {
		return a-b;
	}
	public Integer multiply(Integer a, Integer b) {
		return a*b;
	}
	public Integer divide(Integer a, Integer b) {
		return a/b;
	}
}
