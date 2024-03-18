package com.prowings.onetomany.bidirection;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@NamedQuery(name = "QUERY_GET_ALL_EMP",query = "from Employee")
@NamedQuery(name = "QUERY_GET_ALL_EMP_FIL_SALARY", query = "from Employee e where e.salary > 9000 ORDER BY e.name ASC")



@Entity
@Table(name = "EMPLOYEES")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="EMP_ID",unique = true,nullable = false)
	Long empId;
	
	@Column
	String name;
	
	@Column
	String department;
	
	@Column
	Long salary;
	
	@Column(name = "JOINED_ON")
	Date joinedOn;
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy = "employee",cascade = CascadeType.ALL)
	List<AssetMgnt> assetMgnt;

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public Date getJoinedOn() {
		return joinedOn;
	}

	public void setJoinedOn(Date joinedOn) {
		this.joinedOn = joinedOn;
	}

	public List<AssetMgnt> getAssetMgnt() {
		return assetMgnt;
	}

	public void setAssetMgnt(List<AssetMgnt> assetMgnt) {
		this.assetMgnt = assetMgnt;
	}

	 @Override
	 public String toString() {
	 
	        String resp = this.empId+" | "+this.name+" | "+this.department+" | "+this.salary+" | "+this.joinedOn;
	 
	        return resp;
	    }
	
	
	
	
}
