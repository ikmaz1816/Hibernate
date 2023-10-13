package com.hibernate.HibernateBasics;

import org.hibernate.Session;


public class SavingData<T> {
	public void saveData(T student)
	{
		Session session=CreateConnection.createSession();
		
		CreateConnection.beginTransaction();
		
		session.save(student);
		
		CreateConnection.commitTransaction();
		
		CreateConnection.terminateSession();
		
	}
}
