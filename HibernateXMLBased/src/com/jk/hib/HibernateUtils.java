package com.jk.hib;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

@SuppressWarnings("deprecation")
public class HibernateUtils {
	private static SessionFactory sessionFactory;
	private static ServiceRegistry serviceRegistry;
	
	static
	{
		try{
			Configuration configuration = new Configuration().configure();			
			serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			System.out.println("Session ->" +sessionFactory);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	public static void main(String[] args) {
		System.out.println("-----"+getSessionFactory());
	}
}
