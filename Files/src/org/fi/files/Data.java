package org.fi.files;

import java.io.Serializable;

public class Data implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7778342542376965028L;
	int age;
	String name;
	transient boolean gender;
	
	public Data() {
		
		
	}
	public Data(String name, int age, boolean gender) {
		super();
		this.age = age;
		this.name = name;
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
}
