package com.thinkitive;

public class Employee1 implements Comparable<Employee1> {

	private int empid;
	private String name;
	private double salary;
	private Address a;
	
	public Employee1() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee1(int empid, String name, double salary, Address a) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.a = a;
	}
	
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getA() {
		return a;
	}

	public void setA(Address a) {
		this.a = a;
	}

	@Override
	public int compareTo(Employee1 e) {
		if (this.empid > e.empid) {
			return 1;
		} else if (this.empid < e.empid)
			return -1;
		else
			return 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee1 other = (Employee1) obj;
		if (empid != other.empid)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee1 [empid=" + empid + ", name=" + name + ", salary=" + salary + ", a=" + a + "]";
	}
	
	
	}

	

	

