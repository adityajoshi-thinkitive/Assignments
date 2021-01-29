package com.thinkitive;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();

		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		Address a1 = new Address(999, "Mumbai");
		Address a2 = new Address(555, "Nasik");
		Address a3 = new Address(444, "Kolhapur");
		//Address a4 = new Address(111, "Satara");
		
		Set<Address> l = new HashSet<Address>();
		
		l.add(a1);
		l.add(a2);
		l.add(a3);
		//l.add(a4);
		
		Employee e1 = new Employee(102, "Sachin", 75000, l);
		
		session.save(e1);
		//session.update(e1);
		//session.delete(e1);
		t.commit();
		session.close();
		factory.close();
	}
}
