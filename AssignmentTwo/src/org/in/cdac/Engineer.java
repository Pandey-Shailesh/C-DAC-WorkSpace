package org.in.cdac;

public class Engineer extends Employee {
public float overTime ;

public Engineer(String name, String address, int age, boolean gender, Float salary, float overTime) {
	super(name, address, age, gender, salary);
	this.overTime = overTime;
}

public float getOverTime() {
	return overTime;
}

public void setOverTime(float overTime) {
	this.overTime = overTime;
}

}
