package com.prowings.querycriteria;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.prowings.onetomany.bidirection.Employee;
import com.prowings.util.HibernateUtil;

public class TestNamedQuery {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSession();
		
//		Query namedQuery = session.createNamedQuery("QUERY_GET_ALL_EMP");
		
		Query namedQuery = session.getNamedQuery("QUERY_GET_ALL_EMP_FIL_SALARY");
		
		List<Employee> empList = namedQuery.list();
		
		for(Employee e : empList)
		{
			System.out.println(e);
		}
		
		
	}
}
