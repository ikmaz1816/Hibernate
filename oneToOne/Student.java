package com.oneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tblstudent")
public class Student {
	
	@Id
	@Column(name="studentId")
	private int sid;
	
	@Column(name="studentName")
	private String sname;
	
	@OneToOne
	private Laptop lap;

	public Student() {
		super();
	}

	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	public Student(int sid, String sname, Laptop lap) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.lap = lap;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Laptop getLap() {
		return lap;
	}

	public void setLap(Laptop lap) {
		this.lap = lap;
	}
	
	
}
