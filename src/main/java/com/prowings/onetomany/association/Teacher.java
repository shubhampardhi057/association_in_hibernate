package com.prowings.onetomany.association;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher {

	@Id
	int id;
	
	@Column
	String teacherName;

	public Teacher() {
		super();
	}

	public Teacher(int id, String teacherName) {
		super();
		this.id = id;
		this.teacherName = teacherName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", teacherName=" + teacherName + "]";
	}
	
	
	
}
