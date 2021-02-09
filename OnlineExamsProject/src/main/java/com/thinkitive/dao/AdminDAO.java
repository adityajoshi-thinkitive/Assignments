package com.thinkitive.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.thinkitive.model.Admin;
import com.thinkitive.model.Student;

public class AdminDAO {

	Configuration cfg;
	SessionFactory factory;
	Session session;
	Transaction t;
	
	public AdminDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public void addAdmin(Admin admin) {
		 cfg=new Configuration();
		 factory=cfg.configure().buildSessionFactory();
		 session=factory.openSession();	
		 t=session.beginTransaction();
		 session.save(admin);
		 t.commit();
		 session.close();
		 factory.close();
	}
	
	public void updateAdmin(Admin admin) {
		 cfg=new Configuration();
		 factory=cfg.configure().buildSessionFactory();
		 session=factory.openSession();	
		 t=session.beginTransaction();
		 session.update(admin);
		 t.commit();
		 session.close();
		 factory.close();
	}
	
	public void deleteAdmin(Admin admin) {
		 cfg=new Configuration();
		 factory=cfg.configure().buildSessionFactory();
		 session=factory.openSession();
		 t=session.beginTransaction();
		 session.delete(admin);
		 t.commit();
		 session.close();
		 factory.close();
	}
	
	public Admin displayAdmin() {
		 cfg=new Configuration();
	     factory=cfg.configure().buildSessionFactory();
		 session=factory.openSession();	
		 t=session.beginTransaction();
		 Admin admin = (Admin) session.get(Admin.class, 1); 
		 t.commit();
		 session.close();
		 factory.close();
		 return admin;
	}
}
