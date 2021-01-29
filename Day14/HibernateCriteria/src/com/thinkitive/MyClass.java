package com.thinkitive;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class MyClass {

	public List getEmp(String empname) {
		List l = null;
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();

		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		Criteria c = session.createCriteria(Employee.class);
		
		c.add(Restrictions.eq("ename",empname));
	
		l = c.list();
		System.out.println(l);
		
		t.commit();
		session.close();
		factory.close();
		return l ;
	}
	
	public List getAddress() {
		List l = null;
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();

		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
//		
//		Address a = new Address(432412,"Pune");
//		session.save(a);
		
		Query q= session.createQuery("From Address");
		l = q.list();
		System.out.println(l);
		
		t.commit();
		session.close();
		factory.close();
		return l ;

	}
	public List getEmployees() {
		List l = null;
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();

		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		Criteria c = session.createCriteria(Employee.class);
		c.add(Restrictions.gt("salary", 90000));
		l = c.list();
		System.out.println(l);
		
		t.commit();
		session.close();
		factory.close();
		return l ;
	}
	
	
}
