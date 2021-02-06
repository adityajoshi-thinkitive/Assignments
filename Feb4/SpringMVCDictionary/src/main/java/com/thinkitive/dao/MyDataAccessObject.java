package com.thinkitive.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;


import com.thinkitive.model.Dictionary;


public class MyDataAccessObject {
	
	
	public void addWord(Dictionary d) {
		Configuration config = new Configuration();
		SessionFactory factory = config.configure().buildSessionFactory();

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.save(d);

		tx.commit();
		session.close();
		factory.close();

	}
	public List searchWord(String word) {
		
		Configuration config = new Configuration();
		SessionFactory factory = config.configure().buildSessionFactory();

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();


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
		

		Configuration config = new Configuration();
		SessionFactory factory = config.configure().buildSessionFactory();

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Query q= session.createQuery("From Dictionary");
		List l = q.list();
		System.out.println(l);


		tx.commit();

		session.close();
		factory.close();
		return l;
	}

}