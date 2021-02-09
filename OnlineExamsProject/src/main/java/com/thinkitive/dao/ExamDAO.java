package com.thinkitive.dao;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.thinkitive.model.Exam;
import com.thinkitive.model.Question;

public class ExamDAO {

	Configuration cfg;
	SessionFactory factory;
	Session session;
	Transaction t;
	
	public ExamDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public void addExam(Exam exam) {
		 cfg=new Configuration();
		 factory=cfg.configure().buildSessionFactory();
		 session=factory.openSession();	
		 t=session.beginTransaction();
		 session.save(exam);
		 t.commit();
		 session.close();
		 factory.close();
	}
	
	public Exam displayExam(Integer examId) {
		 cfg=new Configuration();
		 factory=cfg.configure().buildSessionFactory();
		 session=factory.openSession();	
		 t=session.beginTransaction();
		 Exam exam = (Exam) session.get(Exam.class, examId); 
		 t.commit();
		 session.close();
		 factory.close();
		 return exam;
	}
	
	public void updateExam(Exam exam) {
		 cfg=new Configuration();
		 factory=cfg.configure().buildSessionFactory();
		 session=factory.openSession();	
		 t=session.beginTransaction();
		 session.update(exam);
		 t.commit();
		 session.close();
		 factory.close();
	}
	
	public List<Map> getResults(Integer studentId){
		 cfg=new Configuration();
		 factory=cfg.configure().buildSessionFactory();
		 session=factory.openSession();	
		 t=session.beginTransaction();
		 Criteria c=session.createCriteria(Exam.class);
		 c.add(Restrictions.eq("studentId", studentId));
		 List<Exam> elist =c.list();
		 List<Map> resultlist = new ArrayList<Map>();
//		 List<Integer> resultlist = new ArrayList<Integer>();
		 for(Exam exam:elist) {
			 Map map=new LinkedHashMap();
			 map.put("examId",exam.getExamId());
			 map.put("studentId",exam.getStudentId());
			 map.put("questionPaperId",exam.getQuestionPaper().getQuestionPaperId());
			 map.put("marks",exam.getMarks());
			 resultlist.add(map);
		 }
		 t.commit();
		 session.close();
		 factory.close();
		 return resultlist;
	}
	
	public List<Map> getAllResults(){
		 cfg=new Configuration();
		 factory=cfg.configure().buildSessionFactory();
		 session=factory.openSession();	
		 t=session.beginTransaction();
		 Criteria c=session.createCriteria(Exam.class);
//		 c.add(Restrictions.eq("studentId", studentId));
		 List<Exam> elist =c.list();
		 List<Map> resultlist = new ArrayList<Map>();
//		 List<Integer> resultlist = new ArrayList<Integer>();
		 for(Exam exam:elist) {
			 Map map=new LinkedHashMap();
			 map.put("examId",exam.getExamId());
			 map.put("studentId",exam.getStudentId());
			 map.put("questionPaperId",exam.getQuestionPaper().getQuestionPaperId());
			 map.put("marks",exam.getMarks());
			 resultlist.add(map);
		 }
		 t.commit();
		 session.close();
		 factory.close();
		 return resultlist;
	}
}
