package com.cg.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	
	public static void main(String[] args)
	 {
	 
	 Configuration cfg = new Configuration();
	 cfg.configure("hibernate.cfg.xml"); 
	 
	 SessionFactory factory = cfg.buildSessionFactory();
	 Session session = factory.openSession();
	 	 
	 Transaction tx=session.beginTransaction();
	 
	 Product p=new Product();
	 
	 p.setPrice(78);
	 p.setProductName("shashi");
	 
	 session.save(p);
	
	 tx.commit();
	 
	 System.out.println("Object Loaded successfully.....!!");
	 session.close();
	 factory.close();
	 }
}
