package org.fi.reflection;

public class Data {

	public int value;
	
	private int iPrivate;
	public void display() {
		System.out.println("This is the Display Method of Data and value is "+value);
	}
	void show() {
		System.out.println("This is show in package scope");
	}
	
	public Data () {
		System.out.println("This is the default constructor ");
	}
	public Data(String name) {
		System.out.println("this is the para ctor "+name);
	}
}
