package com.prowings.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.prowings.onetoone.association.College;
import com.prowings.onetoone.association.Library;

public class TestOneToOneAssociationCollege {
	
	public static void main(String[] args) {
		
		Library library = new Library(3,1200);
		
		College clg = new College(3,"IIM", library);
		
		
		Configuration cfg = new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction txn = session.beginTransaction();
		
//		session.save(clg);
		
//		session.delete(clg);
	
		session.update(clg);
		
//		College retrivedClg = session.get(College.class,3);
		
//		System.out.println("College clg"+retrivedClg);
		
		
		txn.commit();
		session.close();
	}

}
