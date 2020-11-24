package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name ="Users")
public class User implements Serializable{

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name= "id")

 private Long id;
@Column(name= "firstName")
 private String firstName;
@Column(name= "lastName")
 private String lastName;
@Column(name= "role")
 private Role role ;
@Column(name= "date")
 private Date date ;
 
 public User() {}
 

public User(String firstName, String lastName, Date date, Role role) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.date = date;
	this.role = role;
}


public User(Long id, String firstName, String lastName, Date date, Role role) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.date = date;
	this.role = role;
}



public Long getId() {
	return id;
}



public void setId(Long id) {
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



public Role getRole() {
	return role;
}



public void setRole(Role role) {
	this.role = role;
}



public Date getDate() {
	return date;
}



public void setDate(Date date) {
	this.date = date;
}



@Override
public String toString() {
	return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", role=" + role + ", date="
			+ date + "]";
}
}