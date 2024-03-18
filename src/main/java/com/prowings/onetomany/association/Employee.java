package com.prowings.onetomany.association;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
@Entity
public class Employee {

	@Id
	@Column(name = "ID")
	int employeeId;
	@Column
	String email;
	@Column
	String firstName;
	@Column
	String lastName;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)
	
//	@JoinColumn(name = "Emp_ID")
	
	@JoinTable(name = "EMPLOYEE_ACCOUNT",joinColumns = {@JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "ID")},inverseJoinColumns = {@JoinColumn(name = "ACCOUNT_ID", referencedColumnName = "ID")})
	
	Set<Account> account;
	
	
	public Employee() {
		super();
	}


	public Employee(int employeeId, String email, String firstName, String lastName) {
		super();
		this.employeeId = employeeId;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	

	public Set<Account> getAccount() {
		return account;
	}


	public void setAccount(Set<Account> account) {
		this.account = account;
	}


	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", email=" + email + ", firstName=" + firstName + ", lastName="
				+ lastName + ", account=" + account + "]";
	}


	
	
	
}
