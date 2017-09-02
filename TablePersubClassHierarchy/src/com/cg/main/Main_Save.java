package com.cg.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cg.pojo.OfflineOrder;
import com.cg.pojo.OnlineOrder;


public class Main_Save {
	

	public static void main(String[] args) {
		
		Configuration cf=new Configuration();
		cf.configure("hibernate.cfg.xml");
		//cf.addXML("hibernate.cfg.xml");
		
		SessionFactory factory=cf.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		OfflineOrder o= new OfflineOrder();
		o.setOrderId(2);
		o.setOrderAmount(50000);
		o.setOffLineOrderType("HDFC");
		
		session.save(o);
		
		tx.commit();
		session.close();
	
		
	}

}
