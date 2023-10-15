package com.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Embedded;

@Entity
@Table(name="Individual")
public class Person {
	@Id
	@Column(name="pid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int pid;
	
	@Embedded
	private Info info;

	public Person() {
		super();
	}

	public int getPid() {
		return pid;
	}


	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}
	
	
	
}
