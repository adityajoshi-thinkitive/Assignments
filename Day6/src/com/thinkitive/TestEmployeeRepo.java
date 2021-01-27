package com.thinkitive;

public class TestEmployeeRepo {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Sunil", 25000);
		Employee e2 = new Employee(2, "Anil", 30000);
		Employee e3 = new Employee(3, "Ram", 40000);
		Employee e4 = new Employee(1, "Sham", 25000);
		
		EmployeeRepository repo = new EmployeeRepository();
		
		repo.insertEmp(e1);
		repo.insertEmp(e2);
		repo.insertEmp(e3);
		
		System.out.println(repo.getAll());
		
		repo.updateEmp(e1, e4);
		
		System.out.println(repo.getEmployee(3));
		System.out.println(repo.getAll());
	}
}
