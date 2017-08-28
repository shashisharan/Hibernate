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
	 
	 Product p=new Product(2, "shashi", 234);
	 
	/* to save the object starts*/
	 Transaction tx=session.beginTransaction();
	 session.save(p);
	
	 
	 /* to save the object ends*/
	 
	/* to read the data starts - no need to begin transction in case of reading the data*/
	Object o= session.load(Product.class, 2);
	Product p1=(Product)o;
	System.out.println(p1);
	 /* to read the data starts*/
	 
	 
	/* to update the data starts*/
	p1.setProductName("ravi");
	 
	/* to update the data ends*/
	System.out.println(p);
	 	 	 
    /*  to delete the object in db*/
	session.delete(p);
	/* to delete the data starts*/
	
	 tx.commit();
	 
	 System.out.println("Object Loaded successfully.....!!");
	 session.close();
	 factory.close();
	 }
}
