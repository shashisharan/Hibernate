package com.cg.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main_Save {

	
	public static void main(String[] args)
	 {
	 
	 Configuration cfg = new Configuration();
	 cfg.configure("hibernate.cfg.xml"); 
	 
	 SessionFactory factory = cfg.buildSessionFactory();
	 Session session = factory.openSession();
	 
	 Product p1=new Product(2, "Ptanjali", 20);
	 
	 Transaction tx=session.beginTransaction();

	 session.save(p1);

	
	 tx.commit();
	 session.close();
	 
	 }
}
