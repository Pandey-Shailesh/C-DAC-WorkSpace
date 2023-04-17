package org.in.cdac;

public class Manager extends Employee {
	public float hra ;

	public Manager(String name, String address, int age, boolean gender, Float salary, float hra) {
		super(name, address, age, gender, salary);
		this.hra = hra;
	}

	public float getHra() {
		return hra;
	}

	public void setHra(float hra) {
		this.hra = hra;
	}

	@Override
	public String toString() {
		return "Manager [hra=" + hra + ", name=" + name + ", address=" + address + ", age=" + age + ", gender=" + gender
				+ ", salary=" + salary + "]";
	}

	
}
