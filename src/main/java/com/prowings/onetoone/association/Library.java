package com.prowings.onetoone.association;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Library {
	@Id
	@Column(name = "ID")
	int id;
	
	@Column(name = "NoOFBooks")
	int noOfBooks;
	
	public Library() {
		super();
	}

	public Library(int id, int noOfBooks) {
		super();
		this.id = id;
		this.noOfBooks = noOfBooks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNoOfBooks() {
		return noOfBooks;
	}

	public void setNoOfBooks(int noOfBooks) {
		this.noOfBooks = noOfBooks;
	}

	@Override
	public String toString() {
		return "Library [id=" + id + ", noOfBooks=" + noOfBooks + "]";
	}

	
	
	
}
