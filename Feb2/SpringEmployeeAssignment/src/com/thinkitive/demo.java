package com.thinkitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("new.xml");
		Employee e = context.getBean(Employee.class);
		
		e.setEmpid(101);
		e.setEname("Aditya Joshi");
		e.setBasicSalary(25000);
		System.out.println("Gross Salary: "+e.calculateGrossSalary());
		System.out.println("Net Salary: "+e.calculateNetSalary());
		e.printEmployee();
	}
}
