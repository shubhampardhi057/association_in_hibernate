package com.prowings.onetoone.bidirection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Employee {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int employeeId;
	
	@Column
	String name;
	
	@OneToOne
//	@JoinColumn(name = "ACCOUNt_ID")
	

//  @JoinTable(name = "EMPLOYEE_ACCCOUNT", joinColumns = @JoinColumn(name = "EMPLOYEE_ID"), inverseJoinColumns = @JoinColumn(name = "ACCOUNT_ID"))
	
//	@PrimaryKeyJoinColumn  
	Account account;
	
	
	public Employee() {
		super();
	}


	public Employee(int employeeId, String name, Account account) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.account = account;
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}


	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", account=" + account + "]";
	}


	


	
}
