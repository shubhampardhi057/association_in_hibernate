package com.prowings.onetoone.association;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
	
	@Id
//  @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	int id;
	
	@Column(name = "PIN")
	int pin;
	
	@Column(name = "CITY")
	String city;
	
	@Column(name = "COUNTRY")
	String country;
	
	
	public Address() {
		super();
	}


	
	public Address(int id, int pin, String city, String country) {
		super();
		this.id = id;
		this.pin = pin;
		this.city = city;
		this.country = country;
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getPin() {
		return pin;
	}


	public void setPin(int pin) {
		this.pin = pin;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	@Override
	public String toString() {
		return "Address [id=" + id + ", pin=" + pin + ", city=" + city + ", country=" + country + "]";
	}
	

	
}
