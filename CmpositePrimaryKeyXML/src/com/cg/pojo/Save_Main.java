package com.cg.pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Save_Main {
	
	public static void main(String[] args) {
		
		
	Configuration conf=new Configuration();
	
	conf.configure("hibernate.cfg.xml");
	
	SessionFactory factory=conf.buildSessionFactory();
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	
	Student st=new Student();
	st.setId(1);
	st.setRollNo(345);
	st.setName("ravi");
	
	session.save(st);
	
	tx.commit();
	session.close();
	factory.close();
	}

}
