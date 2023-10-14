package com.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;



public class Hql {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
//		Students s=new Students("Ayaan","2306");
		Session session = CreateConnection.createSession();
		
		CreateConnection.beginTransaction();
		
		Query q=session.createQuery("from Students",Students.class);
		//you can mention as well 
		List<Students> students=q.list();
		
		Query q1=session.createQuery("from Students where id=:b");
		q1.setParameter("b",8);
		Students student=(Students)q1.uniqueResult(); 
		//List<Students> students =session.createQuery("from Students",Students.class).getResultList();
		
		Query q2=session.createQuery("select id,name,address from Students");
		List<Object[]> ls=q2.list();
		
		Query q3=session.createQuery("select id,name,address from Students where id=:b");
		q3.setParameter("b", 8);
		Object[] list=(Object[])q3.uniqueResult();
		CreateConnection.commitTransaction();
		
		CreateConnection.terminateSession();
		
		for(Students s:students)
		{
			System.out.println(s);
		}
		System.out.println();
		System.out.println(student);
		System.out.println();
		
		for(Object[] o:ls)
		{
			System.out.println(o[0]+" "+o[1]+" "+o[2]);
		}
		System.out.println();
		
		for(Object o:list)
		{
			System.out.print(o+" ");
		}
		System.out.println();
	}
}
