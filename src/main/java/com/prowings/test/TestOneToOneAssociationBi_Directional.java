package com.prowings.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.prowings.onetoone.bidirection.Account;
import com.prowings.onetoone.bidirection.Employee;

public class TestOneToOneAssociationBi_Directional {
	
	public static void main(String[] args) {
		
		Account account = new Account();
		
		account.setAccontId(1);
		account.setAccountNumber("123-456-7890");
		
		Employee emp = new Employee();
		
		emp.setEmployeeId(1);
		emp.setName("Ram");
		emp.setAccount(account);
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction txn = session.beginTransaction();
		
//		session.save(emp);
//		session.save(account);
		
		Employee em1 = session.get(Employee.class,1);
		System.out.println(em1);
		
		
//		session.persist(emp);
//		session.persist(account);
		
		
		txn.commit();
		session.close();
		
		
		
	}

}
