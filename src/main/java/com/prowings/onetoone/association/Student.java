package com.prowings.onetoone.association;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	int id;
	
	@Column(name ="ROll")
	int roll;
	
	@Column(name = "NAME")
	String name;

	@OneToOne(cascade = CascadeType.ALL)
	Address address;
	
	
	
	public Student() {
		super();
	}
	
	public Student(int id, int roll, String name, Address address) {
		super();
		this.id = id;
		this.roll = roll;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}
	
	

}
