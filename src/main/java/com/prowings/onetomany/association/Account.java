package com.prowings.onetomany.association;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
	@Id
	@Column(name = "ID")
	int accountId;
	
	@Column
	String accountNumber;
	
	
	public Account() {
		super();
	}


	public Account(int accountId, String accountNumber) {
		super();
		this.accountId = accountId;
		this.accountNumber = accountNumber;
	}


	public int getAccountId() {
		return accountId;
	}


	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}


	public String getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountNumber=" + accountNumber + "]";
	}
	

	
	
	

}
