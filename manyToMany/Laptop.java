package com.manyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="tblLaptop")
public class Laptop {
	
	@Id
	@Column(name="LaptopId")
	private int lid;
	
	@Column(name="LaptopName")
	private String lname;

	

	@ManyToMany()
	private List<Student> stud=new ArrayList<>();
	
	public Laptop() {
		super();
	}

	public Laptop(int lid, String lname) {
		super();
		this.lid = lid;
		this.lname = lname;
	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	public List<Student> getStud() {
		return stud;
	}

	public void setStud(Student stud) {
		this.stud.add(stud);
	}
	
}
