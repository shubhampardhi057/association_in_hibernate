package com.prowings.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.prowings.onetoone.association.Address;
import com.prowings.onetoone.association.Student;

public class TestOneToOneAssociation {
	
	public static void main(String[] args) {
		
		Address address = new Address(2,9876,"Dubai","UAE");
		
		Student std  = new Student(2,20,"Naam",address);
		
		Configuration cfg = new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction txn =  session.beginTransaction();
		
//		session.save(std);
		
//		session.delete(std);
		
//		session.update(std);
		
		Student s1 = session.get(Student.class,1);
		
		System.out.println("Student :  "+s1);
		
		
		txn.commit();
		session.close();
	}

}
