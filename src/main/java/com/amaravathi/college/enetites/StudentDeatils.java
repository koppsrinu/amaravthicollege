package com.amaravathi.college.enetites;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "StudentDeatils")
public class StudentDeatils {
	@Id
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	private String name;
	
	@CreationTimestamp
	private Date dateofbirth;
	private String Dep;
	public String getDep() {
		return Dep;
	}
	public void setDep(String dep) {
		Dep = dep;
	}

}
