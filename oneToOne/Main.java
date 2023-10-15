package com.oneToOne;

import org.hibernate.Session;

public class Main {
	public static void main(String[] args) {
		Session s=CreateConnection.createSession();
		
		
		Laptop laptop=new Laptop(1002,"Dell");
		Student student=new Student(1,"Alfred",laptop);
		laptop.setStud(student);
		CreateConnection.beginTransaction();
		
		s.save(student);
		s.save(laptop);
		
		
		CreateConnection.commitTransaction();
		
		CreateConnection.terminateSession();
	}
}
