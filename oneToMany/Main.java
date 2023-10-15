package com.oneToMany;

import org.hibernate.Session;

public class Main {
	public static void main(String[] args) {
		Session s=CreateConnection.createSession();
		
		
		Laptop laptop=new Laptop(1002,"Dell");
		Laptop laptop1=new Laptop(1003,"IDell");
		Student student=new Student(1,"Alfred",laptop);
		student.setLap(laptop1);
		laptop.setStud(student);
		laptop1.setStud(student);
		CreateConnection.beginTransaction();
		
		s.save(student);
		s.save(laptop);
		s.save(laptop1);
		
		CreateConnection.commitTransaction();
		
		CreateConnection.terminateSession();
	}
}
