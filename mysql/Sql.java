package com.mysql;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import com.hql.CreateConnection;
import com.hql.Students;

public class Sql {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Session session = CreateConnection.createSession();
		
		CreateConnection.beginTransaction();
		
		Query q1=session.createNativeQuery("select * from Students",Students.class);
		
		List<Students> students=q1.getResultList();
		
		Query q2=session.createNativeQuery("select * from Students where studentid=:b",Students.class);
		q2.setParameter("b", 8);
		Students student=(Students)q2.getSingleResult();
		
		Query q3=session.createNativeQuery("select studentid,studentname,studentAddress from students",Students.class);
		List<Students> students1=q3.getResultList();
		
		Query q4=session.createNativeQuery("select studentname,studentAddress from students");
		List<Object[]> students2=q4.getResultList();
		
		
		CreateConnection.commitTransaction();
		
		CreateConnection.terminateSession();
		for(Students stud:students)
		{
			System.out.println(stud);
		}
		System.out.println();
		System.out.println(student);
		System.out.println();
		for(Students stud:students1)
		{
			System.out.println(stud);
		}
		System.out.println();
		for(Object[] obj:students2)
		{
			System.out.println(obj[0]+" "+obj[1]);
		}
	}
}
