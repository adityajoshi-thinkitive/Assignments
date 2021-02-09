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

import com.thinkitive.model.Student;
import com.thinkitive.model.Teacher;


public class TeacherDAO {

	Configuration cfg;
	SessionFactory factory;
	Session session;
	Transaction t;
	
	public TeacherDAO() {

	}
	
	public void addTeacher(Teacher teacher) {
		 cfg=new Configuration();
		 factory=cfg.configure().buildSessionFactory();
		 session=factory.openSession();	
		 t=session.beginTransaction();
		 session.save(teacher);
		 t.commit();
		 session.close();
		 factory.close();
	}
	
	public void updateTeacher(Teacher teacher) {
		 cfg=new Configuration();
		 factory=cfg.configure().buildSessionFactory();
		 session=factory.openSession();	
		 t=session.beginTransaction();
		 session.update(teacher);
		 t.commit();
		 session.close();
		 factory.close();
	}
	
	public void deleteTeacher(Teacher teacher) {
		 cfg=new Configuration();
		 factory=cfg.configure().buildSessionFactory();
		 session=factory.openSession();
		 t=session.beginTransaction();
		 session.delete(teacher);
		 t.commit();
		 session.close();
		 factory.close();
	}
	
	public Teacher displayTeacher(Integer teacherId) {
		 cfg=new Configuration();
	     factory=cfg.configure().buildSessionFactory();
		 session=factory.openSession();	
		 t=session.beginTransaction();
		 Teacher teacher = (Teacher) session.get(Teacher.class, teacherId); 
		 t.commit();
		 session.close();
		 factory.close();
		 return teacher;
	}
	
	public List<Teacher> displayAll() {
		 cfg=new Configuration();
		 factory=cfg.configure().buildSessionFactory();
		 session=factory.openSession();	
		 t=session.beginTransaction();
		 Criteria c=session.createCriteria(Teacher.class);
		 List teacherlist =c.list();
		 t.commit();
		 session.close();
		 factory.close();
		 return teacherlist;
	}
	
	public List<Map> displayTeacherApprovalRequests() {
		 cfg=new Configuration();
		 factory=cfg.configure().buildSessionFactory();
		 session=factory.openSession();	
		 t=session.beginTransaction();
		 Criteria c=session.createCriteria(Teacher.class);
		 c.add(Restrictions.eq("adminApprovalTeacher", false));
		 List<Teacher> tl =c.list();
		// List<Exam> elist =c.list();
		 List<Map> teacherlist = new ArrayList<Map>();
//		 List<Integer> resultlist = new ArrayList<Integer>();
		 for(Teacher teacher:tl) {
			 Map map=new LinkedHashMap();
			 map.put("teacherId", teacher.getTeacherId());
			 map.put("teacherName", teacher.getTeacherName());
			 map.put("teacherUsername", teacher.getTeacherUsername());
			 map.put("teacherPassword", teacher.getTeacherPassword());
			 map.put("adminApprovalTeacher", teacher.getAdminApprovalTeacher());
			 teacherlist.add(map);
		 }
		 t.commit();
		 session.close();
		 factory.close();
		 return teacherlist;
	}
	
}
