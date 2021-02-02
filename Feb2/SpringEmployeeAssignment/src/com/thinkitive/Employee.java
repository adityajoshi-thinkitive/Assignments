package com.thinkitive;

public class Employee {

	private int empid;
	private String ename;
	private double basicSalary, pf, pt, hra, medical, grossSalary, netSalary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String ename, double basicSalary) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.basicSalary = basicSalary;
	}

	public void printEmployee() {
		System.out.println(this);
	}
	
	public double calculateGrossSalary() {
		this.pf = 0.12 * this.basicSalary;
		this.hra = 0.5 * this.basicSalary;
		this.pt = 200;
		this.grossSalary = this.basicSalary + this.hra + this.medical;
		return this.grossSalary;
	}
	
	public double calculateNetSalary() {
		this.netSalary = this.grossSalary - this.pf - this.pt;
		return this.netSalary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", basicSalary=" + basicSalary + ", pf=" + pf + ", pt="
				+ pt + ", hra=" + hra + ", medical=" + medical + ", grossSalary=" + grossSalary + ", netSalary="
				+ netSalary + "]";
	}
	
	
}
