package com.hibernate.HibernateBasics;

import org.hibernate.Session;

import com.models.Students;

public class RetrieveData {
	public Students retrieveData(int id)
	{
		Session s=CreateConnection.createSession();
		
		CreateConnection.beginTransaction();
		
		Students stud=s.get(Students.class,2);
		CreateConnection.commitTransaction();
		
		CreateConnection.terminateSession();
		
		return stud;
	}
}
