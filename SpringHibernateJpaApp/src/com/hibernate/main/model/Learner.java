package com.hibernate.main.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //This tells hibernate to create table for this class
@Table(name = "learner") //this will create table
public class Learner {
	
	@Id //Primary Key
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(nullable = false) //NOT NULL
	private String name;
	private String email;
	private String contact;
	
	public Learner() {
		
	}
	
	public Learner(int id, String name, String email, String contact) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contact = contact;
	}
	
	public Learner(String name, String email, String contact) {
		this.name = name;
		this.email = email;
		this.contact = contact;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Learner [id=" + id + ", name=" + name + ", email=" + email + ", contact=" + contact + "]";
	}
	
	
	
	
	
	

}
