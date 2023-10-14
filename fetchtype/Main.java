package com.fetchtype;

import org.hibernate.Session;


public class Main {
	public static void main(String[] args) {
		Session s=CreateConnection.createSession();
		
		
		
		CreateConnection.beginTransaction();
		
		Student student=s.get(Student.class, 1);//Object instantiated for get
		student=s.load(Student.class, 1);
		/*
		 	Get returns null
		 	Load returns throw NotFoundException
		 	
		 	Get-> get the object when you call it
		 	load->loads the object when you print it 
		 */
		
		CreateConnection.commitTransaction();
		
		CreateConnection.terminateSession();
		System.out.println(student);//Object instantiated for load
	}
}
