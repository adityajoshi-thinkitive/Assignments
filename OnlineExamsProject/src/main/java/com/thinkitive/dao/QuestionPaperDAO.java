package com.thinkitive.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.thinkitive.model.QuestionPaper;

public class QuestionPaperDAO {

	Configuration cfg;
	SessionFactory factory;
	Session session;
	Transaction t;
	
	public QuestionPaperDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public void addQuestionPaper(QuestionPaper questionpaper) {
		 cfg=new Configuration();
		 factory=cfg.configure().buildSessionFactory();
		 session=factory.openSession();	
		 t=session.beginTransaction();
		 session.save(questionpaper);
		 t.commit();
		 session.close();
		 factory.close();
	}
	
	public QuestionPaper displayQuestionPaper(Integer questionPaperId) {
		 cfg=new Configuration();
		 factory=cfg.configure().buildSessionFactory();
		 session=factory.openSession();	
		 t=session.beginTransaction();
		 QuestionPaper questionpaper = (QuestionPaper) session.get(QuestionPaper.class, questionPaperId); 
		 t.commit();
		 session.close();
		 factory.close();
		 return questionpaper;
	}
}
