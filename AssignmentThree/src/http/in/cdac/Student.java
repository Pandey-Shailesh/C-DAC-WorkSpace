package http.in.cdac;

public abstract class Student {
 protected String name;
 protected String address;
 protected boolean gender;
 protected String date;

public String getDate() {
	return date;
}


public void setDate(String date) {
	
	this.date = date;
}


public Student(String name, String address, boolean gender,String date) {
	super();
	this.name = name;
	this.address = address;
	this.gender = gender;
	this.date=date;
//	this.date=new Date();
//	this.date.setDay();
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public boolean isGender() {
	return gender;
}
public void setGender(boolean gender) {
	this.gender = gender;
}
 
 
 
 
 
 
 
 
}
