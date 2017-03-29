package com.ashish.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ashish.dto.UserDetails;

public class HibernateTest {
	
	//private static SessionFactory sessionFactory=null

	public static void main(String[] args) {

		UserDetails details= new UserDetails();
		
		details.setUserId(32);
		details.setUserName("JavaBrains");
	
		
		HibernateTest test=new HibernateTest();
		test.setUserDetails(details);
		
	}
	
	public void setUserDetails(UserDetails details)
	{
		HibernateTest test=new HibernateTest();
		SessionFactory sessionFactory= test.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		session.save(details);
		session.getTransaction().commit();
		
		sessionFactory.close();
	}
	
	public SessionFactory getSessionFactory()
	{
		SessionFactory sessionFactory=null;
		if(sessionFactory==null)
		{
		 sessionFactory= new Configuration().configure().buildSessionFactory();
		}
		
		return sessionFactory;
	}

}
