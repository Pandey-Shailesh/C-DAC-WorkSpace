package org.fi;

public class Parent {
String name;
int age;
public Parent() {
	System.out.println("Default parent Fired");
	name="t";
	age=4;
}
public Parent(float test) {
	System.out.println("parent single parameter ");
}
public Parent(String name,int age) {
	super();
	this.name =name;
	this.age=age;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}


}
