package com.prowings.querycriteria;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.prowings.onetomany.bidirection.Employee;
import com.prowings.util.HibernateUtil;

public class TestNamedNativeQuery {
	
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSession();
		
		Query namedQuery = session.getNamedNativeQuery("nativeSql");
		
		List<Object[]> assets = namedQuery.getResultList();
		
		
		for(Object[] arr : assets)
		{
			
			System.out.println(Arrays.toString(arr));
		}
	}

}
