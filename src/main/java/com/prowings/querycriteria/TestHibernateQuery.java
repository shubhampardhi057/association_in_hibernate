package com.prowings.querycriteria;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.prowings.onetomany.bidirection.Employee;
import com.prowings.util.HibernateUtil;

public class TestHibernateQuery {
	
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSession();
		
		Query query = session.createQuery("from Employee e");
		
		
		
		
		List<Employee> empList = query.list();
		
		for(Employee e  : empList)
		{
			System.out.println(e);
			
		}
		
		System.out.println(">>>>>>>Update<<<<<<<<<");
		
		Transaction txn = session.beginTransaction();
		
		Query updateQuery = session.createQuery("update Employee set DEPARTMENT = :dept "+"where EMP_ID = :eId");
		
		updateQuery.setParameter("dept","HR");
		updateQuery.setParameter("eId",2);

		updateQuery.executeUpdate();
		
		
		txn.commit();
	}

}
