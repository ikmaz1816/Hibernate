package com.cacheable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;



public class CreateConnection {
	private static Session session;
	private static Transaction transaction;
	public static Session createSession()
	{
		Configuration c=new Configuration().configure().addAnnotatedClass(Students.class);
		
		ServiceRegistry sr=new StandardServiceRegistryBuilder().applySettings(c.getProperties()).build();
		
		SessionFactory sf=c.buildSessionFactory(sr);
		
		session =sf.openSession();
		
		return session;
	}
	public static void beginTransaction()
	{
		transaction=session.beginTransaction();
	}
	public static void commitTransaction()
	{
		transaction.commit();
	}
	public static void terminateSession()
	{
		session.close();
	}
}
