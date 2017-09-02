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
	 
	 //object is now in detached state- to bring down to persistent state just need to  
	 //open a new session
	 Session session2=factory.openSession();
	 Transaction tx2=session2.beginTransaction();
	 p.setPrice(34);
	 //p.setProductId(12);
	 session2.update(p);
	 
	 tx2.commit();
	 session2.close();
	 
	 
	 factory.close();
	 }
}
