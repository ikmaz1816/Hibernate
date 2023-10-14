package com.cacheable;

import org.hibernate.Session;

public class Main {
	/*
	 	Caching are of two types in hibernate
	 	1) L1 caching
	 	2)L2 caching
	 	l1-> Takes place in a session
	 	l2->Takes place outside a session
	 */
	public static void main(String[] args) {
		Session session = CreateConnection.createSession();
		//We need ehcache and hibernate-jcache
		//to make a query cacheable set q.setCacheable(true)
//		Students s1=new Students("Imran","1151");
		CreateConnection.beginTransaction();
		Students s1=session.get(Students.class, 10);
		Students s2=session.get(Students.class, 10);
//		session.save(s1);
		CreateConnection.commitTransaction();
		
		CreateConnection.terminateSession();
		
		Session session2 = CreateConnection.createSession();
		
//		Students s1=new Students("Imran","1151");
		CreateConnection.beginTransaction();
		Students s3=session2.get(Students.class, 10);
//		session.save(s1);
		CreateConnection.commitTransaction();
		
		CreateConnection.terminateSession();
	}
}
