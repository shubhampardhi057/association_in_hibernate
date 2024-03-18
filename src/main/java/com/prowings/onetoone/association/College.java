package com.prowings.onetoone.association;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class College {

	@Id
	@Column(name = "ID")
	int id;
	
	@Column(name = "Name")
	String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	Library library;
	
	public College() {
		super();
	}
	public College(int id, String name, Library library) {
		super();
		this.id = id;
		this.name = name;
		this.library = library;
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
	public Library getLibrary() {
		return library;
	}
	public void setLibrary(Library library) {
		this.library = library;
	}
	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", library=" + library + "]";
	}

	
}

