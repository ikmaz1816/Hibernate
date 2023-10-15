package com.models;

import javax.persistence.Embeddable;

@Embeddable
public class Info {
	private String fname;
	private String lname;
	
	
	public Info() {
		super();
	}
	public Info(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	
}
