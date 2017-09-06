package com.cg.test;

import java.util.ArrayList;
import java.util.List;

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
	 
	 Question_Answer qa=new Question_Answer();
	 
	 qa.setQuestion("what is the your name");
	 
	 List<String> ans=new ArrayList<String>();
	 
	 ans.add("shashi");
	 ans.add("ravi");
	 ans.add("prashant");
	 qa.setAnswers(ans);
	 session.persist(qa);
	 tx.commit();
	
	 factory.close();
	 

	 }
}
