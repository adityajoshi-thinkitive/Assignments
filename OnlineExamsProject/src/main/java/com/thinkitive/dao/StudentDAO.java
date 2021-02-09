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
import com.thinkitive.model.Student;

public class StudentDAO {

	Configuration cfg;
	SessionFactory factory;
	Session session;
	Transaction t;
	
	public StudentDAO() {

	}
	
	public void addStudent(Student student) {
		 cfg=new Configuration();
		 factory=cfg.configure().buildSessionFactory();
		 session=factory.openSession();	
		 t=session.beginTransaction();
		 session.save(student);
		 t.commit();
		 session.close();
		 factory.close();
	}
	
	public void updateStudent(Student student) {
		 cfg=new Configuration();
		 factory=cfg.configure().buildSessionFactory();
		 session=factory.openSession();	
		 t=session.beginTransaction();
		 session.update(student);
		 t.commit();
		 session.close();
		 factory.close();
	}
	
	public void deleteStudent(Student student) {
		 cfg=new Configuration();
		 factory=cfg.configure().buildSessionFactory();
		 session=factory.openSession();
		 t=session.beginTransaction();
		 session.delete(student);
		 t.commit();
		 session.close();
		 factory.close();
	}
	
	public Student displayStudent(Integer studentId) {
		 cfg=new Configuration();
	     factory=cfg.configure().buildSessionFactory();
		 session=factory.openSession();	
		 t=session.beginTransaction();
		 Student student = (Student) session.get(Student.class, studentId); 
		 t.commit();
		 session.close();
		 factory.close();
		 return student;
	}
	
	public List<Student> displayAll() {
		 cfg=new Configuration();
		 factory=cfg.configure().buildSessionFactory();
		 session=factory.openSession();	
		 t=session.beginTransaction();
		 Criteria c=session.createCriteria(Student.class);
		 List studentlist =c.list();
		 t.commit();
		 session.close();
		 factory.close();
		 return studentlist;
	}
	
	public List<Map> displayStudentApprovalRequests() {
		 cfg=new Configuration();
		 factory=cfg.configure().buildSessionFactory();
		 session=factory.openSession();	
		 t=session.beginTransaction();
		 Criteria c=session.createCriteria(Student.class);
		 c.add(Restrictions.eq("adminApprovalStudent", false));
		 List<Student> sl =c.list();
		// List<Exam> elist =c.list();
		 List<Map> studentlist = new ArrayList<Map>();
//		 List<Integer> resultlist = new ArrayList<Integer>();
		 for(Student student:sl) {
			 Map map=new LinkedHashMap();
			 map.put("studentId", student.getStudentId());
			 map.put("studentName", student.getStudentName());
			 map.put("studentUsername", student.getStudentUsername());
			 map.put("studentPassword", student.getStudentPassword());
			 map.put("adminApprovalStudent", student.getAdminApprovalStudent());
			 studentlist.add(map);
		 }
		 t.commit();
		 session.close();
		 factory.close();
		 return studentlist;
	}
}
