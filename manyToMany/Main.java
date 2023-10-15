package com.manyToMany;

import org.hibernate.Session;

public class Main {
	public static void main(String[] args) {
		Session s=CreateConnection.createSession();
		
		
		Laptop laptop=new Laptop(1002,"Dell");
		Laptop laptop1=new Laptop(1003,"IDell");
		Student student=new Student(1,"Alfred",laptop);
		Student student2=new Student(2,"Imran",laptop);
		student2.setLap(laptop1);
		student.setLap(laptop1);
		laptop.setStud(student);
		laptop1.setStud(student);
		laptop.setStud(student2);
		laptop1.setStud(student2);
		CreateConnection.beginTransaction();
		
		s.save(student);
		s.save(laptop);
		s.save(laptop1);
		s.save(student2);
		CreateConnection.commitTransaction();
		
		CreateConnection.terminateSession();
	}
}
