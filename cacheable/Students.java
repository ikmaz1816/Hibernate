package com.cacheable;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="studentsInfo")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Students {
	@Id
	@Column(name="studentId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(nullable=false,name="studentName")
	private String name;
	@Column(nullable=false,name="studentAddress")
	private String address;
	public Students() {
		super();
	}
	
	public Students(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}
