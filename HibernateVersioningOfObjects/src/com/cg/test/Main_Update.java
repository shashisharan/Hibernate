package com.cg.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main_Update {
	
	public static void main(String[] args)
	 {
	 
	 Configuration cfg = new Configuration();
	 cfg.configure("hibernate.cfg.xml"); 
	 
	 SessionFactory factory = cfg.buildSessionFactory();
	 Session session = factory.openSession();
	 
	 Transaction tx=session.beginTransaction();
	 
	 //Product p2= new Product(2, "Dabar", 45);
	 
	 Object o=session.load(Product.class,new Integer(2));
	 Product p2=(Product)o;
	 p2.setProductName("vicks");
	 
	 //session.update(p2);
	 
	 
	
	 tx.commit();
	 session.close();
	 
	 }

}
