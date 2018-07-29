package com.philipap.model;

import java.io.Serializable;

public class Person implements Serializable{
	
	/**
	 *PhilipAp 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer personId;
	private String firtName;
	private String lastName;
	private String email;
	private Integer age;
	
	public Person() {
		
	}
	
	public Person(Integer personId, String firtName, String lastName, String email, Integer age) {
		super();
		this.personId = personId;
		this.firtName = firtName;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
	}

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getFirtName() {
		return firtName;
	}

	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
			
	
}
