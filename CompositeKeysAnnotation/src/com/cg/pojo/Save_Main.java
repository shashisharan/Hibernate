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
	
	//to save in java  
	Student st=new Student();
	st.setId(1);
	st.setName("Shashi");
	st.setRollNo(345);
	
	session.save(st);
	
	tx.commit();
	session.close();
	
	Session session2=factory.openSession();
	Transaction tx1=session2.beginTransaction();
	
	Student t2=new Student();
	t2.setId(1);
	//t2.setRollNo(345);
	Student st1=(Student)session2.get(Student.class, t2);
	
	System.out.println(st1.getName());
	tx1.commit();
	session2.close();
	
	factory.close();
	
	
	}

}
