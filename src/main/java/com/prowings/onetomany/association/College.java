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
public class College {
	
	@Id
	int id;
	
	@Column
	String collegeName;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)
	
//	@JoinColumn(name = "COLLEGE_ID")
	
	@JoinTable(name = "COLLEGE_TEACHER",joinColumns = {@JoinColumn(name = "COLLEGE_ID", referencedColumnName = "ID")},inverseJoinColumns = {@JoinColumn(name = "TEACHER_ID", referencedColumnName = "ID")})
	
	Set<Teacher> teacher;

	public College() {
		super();
	}

	public College(int id, String collegeName, Set<Teacher> teacher) {
		super();
		this.id = id;
		this.collegeName = collegeName;
		this.teacher = teacher;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public Set<Teacher> getTeacher() {
		return teacher;
	}

	public void setTeacher(Set<Teacher> teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "College [id=" + id + ", collegeName=" + collegeName + ", teacher=" + teacher + "]";
	}

	
	
	
	
	
	
	

}
