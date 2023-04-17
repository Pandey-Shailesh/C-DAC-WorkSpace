package org.in.cdac;

public abstract class Employee {
	public String name;
	public String address;
	public int age;
	public boolean gender;
	public Float salary;


	public Employee(String name, String address, int age, boolean gender, Float salary) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age>18 && age<60) {
			this.age = age;
		}
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", age=" + age + ", gender=" + gender + ", salary="
				+ salary + "]";
	}

	
}
