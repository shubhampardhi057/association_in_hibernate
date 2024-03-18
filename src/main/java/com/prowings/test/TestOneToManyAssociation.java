package com.prowings.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.prowings.onetomany.association.Account;
import com.prowings.onetomany.association.Employee;

public class TestOneToManyAssociation {
	
	public static void main(String[] args) {
		
		Account acc1 = new Account();
		acc1.setAccountId(1);
		acc1.setAccountNumber("1234ABCD");
		
		Account acc2 = new Account();
		acc2.setAccountId(2);
		acc2.setAccountNumber("5678EFGH");
		
		Account acc3 = new Account();
		acc3.setAccountId(3);
		acc3.setAccountNumber("0987IJKL");
		
		
		Set<Account> account = new HashSet<Account>();
		account.add(acc1);
		account.add(acc2);
		account.add(acc3);
		
		Employee emp = new Employee();
		
		emp.setEmployeeId(1);
		emp.setEmail("Ram057@gmail.com");
		emp.setFirstName("Ram");
		emp.setLastName("Prabhu");
		emp.setAccount(account);
		
		
		
		Configuration cfg = new Configuration();
		
		cfg.configure("hibernate.cfg_onetomany.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction txn = session.beginTransaction();
		
//		session.save(emp);
		
//		Employee e1 = session.get(Employee.class,1);
//		System.out.println(e1);
//		session.delete(e1);
		
//		Account acco1 = session.get(Account.class, 1);
//		session.delete(acco1);
//		
//		Account acco2 = session.get(Account.class, 2);
//		session.delete(acco2);
//		
//		Account acco3 = session.get(Account.class, 3);
//		session.delete(acco3);
	
		
		
		txn.commit();
		session.close();
	}

}
