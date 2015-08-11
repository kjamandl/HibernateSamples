package com.jk.dao;

import org.hibernate.SessionFactory;

import com.jk.hib.HibernateUtils;

public class EmployeeDAO {
	private SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

	public String getEmployee1(int employeeId) {
		if (employeeId == 14) {
			return "Kishore";
		} else {
			return "No employee found";
		}
	}

	public String getEmployee2(int employeeId) {
		if (employeeId == 15) {
			return "Kishore1";
		} else {
			return "No employee found";
		}
	}
}
