package com.Entity;

public class sunEntity {
  private int id;
  private String fname;
  private String lname;
  private String add;
  private String street;
  private String city;
  private String state;
  private String email;
  private String phone;
public sunEntity() {
	super();
	// TODO Auto-generated constructor stub
}
public sunEntity(int id, String fname, String lname, String add, String street, String city, String state, String email,
		String phone) {
	super();
	this.id = id;
	this.fname = fname;
	this.lname = lname;
	this.add = add;
	this.street = street;
	this.city = city;
	this.state = state;
	this.email = email;
	this.phone = phone;
}
public sunEntity(String fname, String lname, String add, String street, String city, String state, String email,
		String phone) {
	super();
	this.fname = fname;
	this.lname = lname;
	this.add = add;
	this.street = street;
	this.city = city;
	this.state = state;
	this.email = email;
	this.phone = phone;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getAdd() {
	return add;
}
public void setAdd(String add) {
	this.add = add;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
@Override
public String toString() {
	return "sunEntity [id=" + id + ", fname=" + fname + ", lname=" + lname + ", add=" + add + ", street=" + street
			+ ", city=" + city + ", state=" + state + ", email=" + email + ", phone=" + phone + "]";
}
  
}
