package com.jk.hib.one2one;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.jk.hib.HibernateUtils;

public class One2OneTest {

	public static void main(String[] args) {

		try {
			SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
			Session session = sessionFactory.openSession();
			session.getTransaction().begin();
			
			JKEmployee employee = new JKEmployee();
			JKAddress address = new JKAddress();
			address.setAddressId(new Long(2001));
			address.setArea("Pragathi Nagar");
			address.setCity("Hyderabad");
			address.setState("Andhra Pradesh");
			address.setPincode("500090");
			
			employee.setAddress(address);
			employee.setEmpId(new Long(500001));
			employee.setName("Kishore");
			
			session.save(address);
			session.save(employee);
			
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

}
