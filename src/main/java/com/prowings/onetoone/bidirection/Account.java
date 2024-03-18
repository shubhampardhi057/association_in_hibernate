package com.prowings.onetoone.bidirection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Account {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int accountId;
	
	@Column
	String accountNumber;

//	@OneToOne
//	@OneToOne(mappedBy = "account")
	Employee emoloyee;
	
	
	public Account() {
		super();
	}
	
	public Account(int accountId, String accountNumber, Employee emoloyee) {
		super();
		this.accountId = accountId;
		this.accountNumber = accountNumber;
		this.emoloyee = emoloyee;
	}
	
	
	public int getAccontId() {
		return accountId;
	}
	public void setAccontId(int accontId) {
		this.accountId = accontId;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Employee getEmoloyee() {
		return emoloyee;
	}
	public void setEmoloyee(Employee emoloyee) {
		this.emoloyee = emoloyee;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountNumber=" + accountNumber + ", emoloyee=" + emoloyee + "]";
	}
	
	
	
	

}
