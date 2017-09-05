package com.cg.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")
public class Student implements Serializable{
	
	
	@Id
    @Column(name="ID")
	private Integer id;
	
	@Id
	@Column(name="NAME")
	private String name;
	
	
	@Column(name="RollNo")
	private Integer rollNo;
	
			

	public Student() {
		super();
	}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Integer getRollNo() {
		return rollNo;
	}


	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}
	
	

}
