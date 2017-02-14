package com.ashish.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ashish.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {

		UserDetails details= new UserDetails();
		
		details.setUserId(6);
		details.setUserName("six");
	
		
		
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		session.save(details);
		session.getTransaction().commit();
		
	}

}
