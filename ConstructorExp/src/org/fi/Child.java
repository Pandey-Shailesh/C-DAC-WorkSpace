package org.fi;

public class Child extends Parent {
float salary;
public Child(float salary) {
	super(salary);
	System.out.println("Default Child");
	this.salary = salary;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}

}
