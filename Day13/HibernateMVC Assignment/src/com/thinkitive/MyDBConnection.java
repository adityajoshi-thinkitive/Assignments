package com.thinkitive;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MyDBConnection {
	Configuration cfg;
	SessionFactory factory;
	Session session;
	Transaction tx;
	
	int empid, salary;
	String empname;
	public MyDBConnection() {
		// TODO Auto-generated constructor stub
		cfg = new Configuration();  
	}
	public MyDBConnection(int empid, String empname, int salary) {
		// TODO Auto-generated constructor stub
		this();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
		
		  
	}

	public void insertEmployee() {
		Employee e = new Employee(this.empid, this.empname, this.salary);
		factory = cfg.configure().buildSessionFactory();
		session = factory.openSession();// CONNECTION OPEN
		tx = session.beginTransaction();

		session.save(e);


		tx.commit();

		session.close();
		factory.close();

	}
	public void updateEmployee() {
		Employee e = new Employee(this.empid, this.empname, this.salary);
		factory = cfg.configure().buildSessionFactory();
		session = factory.openSession();// CONNECTION OPEN
		tx = session.beginTransaction();

		session.update(e);


		tx.commit();

		session.close();
		factory.close();
	}
	public void deleteEmployee() {
		Employee e = new Employee(this.empid, this.empname, this.salary);
		factory = cfg.configure().buildSessionFactory();
		session = factory.openSession();// CONNECTION OPEN
		tx = session.beginTransaction();

		session.delete(e);


		tx.commit();

		session.close();
		factory.close();
	}
	public List showEmployee() {
		Employee e = new Employee(this.empid, this.empname, this.salary);
		factory = cfg.configure().buildSessionFactory();
		session = factory.openSession();// CONNECTION OPEN
		tx = session.beginTransaction();

		//Query q= session.createQuery("From Employee where salary < 90000");
		Query q= session.createQuery("From Employee");
		List l = q.list();
		System.out.println(l);


		tx.commit();

		session.close();
		factory.close();
		return l;
	}
}