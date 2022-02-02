package com.example.ticketdomain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BOOK MOVIE RICKET")
public class Movie {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	@Column(name="first-name")
private String firstname;
	@Column(name="second-name")
private String secondname;
	@Column(name="e-mail")
private String email;
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getSecondname() {
	return secondname;
}
public void setSecondname(String secondname) {
	this.secondname = secondname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}




}
