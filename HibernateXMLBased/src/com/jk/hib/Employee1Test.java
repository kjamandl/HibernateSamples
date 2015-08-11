package com.jk.hib;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jk.entities.Employee1;

public class Employee1Test {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Employee1 emp = new Employee1();
		emp.setEmpId(15);
		emp.setName("Kishore");
		emp.setRole("S.Lead");
		emp.setInsertTime(new Date(System.currentTimeMillis()));
		
		session.save(emp);
		tx.commit();
		//session.close();
		sessionFactory.close();
	}

}
