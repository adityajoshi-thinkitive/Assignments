package com.thinkitive.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.thinkitive.model.Question;


public class QuestionDAO {

	Configuration cfg;
	SessionFactory factory;
	Session session;
	Transaction t;
	
	public QuestionDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public void addQuestion(Question question) {
		 cfg=new Configuration();
		 factory=cfg.configure().buildSessionFactory();
		 session=factory.openSession();	
		 t=session.beginTransaction();
		 session.save(question);
		 t.commit();
		 session.close();
		 factory.close();
	}
	
	public List<Question> displayAll() {
		cfg=new Configuration();
		factory=cfg.configure().buildSessionFactory();
		 session=factory.openSession();
			
		 t=session.beginTransaction();
		  
		 Criteria c=session.createCriteria(Question.class);
		 List qlist =c.list();

		 t.commit();
		 session.close();
		 factory.close();
		 return qlist;
	} 
		
}
