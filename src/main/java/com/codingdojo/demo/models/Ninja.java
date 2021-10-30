package com.codingdojo.demo.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="ninjas")
public class Ninja {

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Size(max=255)
	@NotNull
	private String firstName = "";
	
	@Size(max=255)
	@NotNull
	private String lastName = "";
	
	@NotNull
	private int age;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="dojoId")
	private Dojo dojoId;
	
	public Ninja() {
	}
	
	public Ninja(String firstName, String lastName, int age, Dojo dojoId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.dojoId = dojoId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Dojo getDojoId() {
		return dojoId;
	}

	public void setDojoId(Dojo dojoId) {
		this.dojoId = dojoId;
	}
	
	
}
