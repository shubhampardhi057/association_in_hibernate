package com.prowings.onetomany.bidirection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;



@NamedNativeQuery(name = "nativeSql", query ="select ASSET_NAME, VENDOR from ASSET_MNGT")



@Entity
@Table(name ="ASSET_MHGT")
public class AssetMgnt {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="AM_ID", unique = true, nullable = false)
	Long amId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	Employee employee;
	
	@Column(name = "ASSET_NAME")
	String assetName;
	
	String vender;

	public Long getAmId() {
		return amId;
	}

	public void setAmId(Long amId) {
		this.amId = amId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public String getVender() {
		return vender;
	}

	public void setVender(String vender) {
		this.vender = vender;
	}

	 public String toString() {
		 
	        return this.assetName+" | "+this.vender;
	    }
	
	
	

}
