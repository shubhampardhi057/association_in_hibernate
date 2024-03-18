package com.prowings.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.prowings.onetomany.association.College;
import com.prowings.onetomany.association.Teacher;

public class TestOneToManyAssociationCollege {

	public static void main(String[] args) {

		Teacher teach1 = new Teacher();
		teach1.setId(7);
		teach1.setTeacherName("SSS");

		Teacher teach2 = new Teacher();
		teach2.setId(8);
		teach2.setTeacherName("HHH");

		Teacher teach3 = new Teacher();
		teach3.setId(9);
		teach3.setTeacherName("JJJ");

		Set<Teacher> teachSet = new HashSet<Teacher>();
		teachSet.add(teach1);
		teachSet.add(teach2);
		teachSet.add(teach3);

		College college = new College();
		college.setId(3);
		college.setCollegeName("NITS");
		college.setTeacher(teachSet);

		Configuration cfg = new Configuration();

		cfg.configure("hibernate.cfg_onetomany.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session session = sf.openSession();

//		Transaction txn = session.beginTransaction();

//		session.save(college);

		String queryString = "from College where id = 1";

		Query query = session.createQuery(queryString);

		List<College> clgList = query.list();

		for (College c : clgList)
		{
			System.out.println(c);
		}

//		txn.commit();
		session.close();
	}

}
