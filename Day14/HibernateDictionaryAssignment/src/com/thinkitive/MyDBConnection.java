package com.thinkitive;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class MyDBConnection {
	Configuration cfg;
	SessionFactory factory;
	Session session;
	Transaction tx;
	
	String word, meaning;
	public MyDBConnection() {
		// TODO Auto-generated constructor stub
		cfg = new Configuration();  
		cfg.addAnnotatedClass(Dictionary.class);
	}
	public MyDBConnection(String word, String meaning) {
		// TODO Auto-generated constructor stub
		this();
		this.word = word;
		this.meaning = meaning; 
	}

	public void addWord() {
		Dictionary d = new Dictionary(this.word, this.meaning);
		factory = cfg.configure().buildSessionFactory();
		session = factory.openSession();// CONNECTION OPEN
		tx = session.beginTransaction();

		session.save(d);


		tx.commit();

		session.close();
		factory.close();

	}
	public List searchWord() {
		
		factory = cfg.configure().buildSessionFactory();
		session = factory.openSession();// CONNECTION OPEN
		tx = session.beginTransaction();

		Criteria c = session.createCriteria(Dictionary.class);
		
		c.add(Restrictions.eq("word",word));
	
		List l = c.list();
		System.out.println(l);


		tx.commit();

		session.close();
		factory.close();
		
		return l;
	}
	
	public List showDictionary() {
		
		factory = cfg.configure().buildSessionFactory();
		session = factory.openSession();// CONNECTION OPEN
		tx = session.beginTransaction();

		Query q= session.createQuery("From Dictionary");
		List l = q.list();
		System.out.println(l);


		tx.commit();

		session.close();
		factory.close();
		return l;
	}
}