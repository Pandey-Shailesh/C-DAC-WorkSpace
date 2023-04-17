package org.in.cdac;

public class SalePerson extends Employee {
	public float commission ;
	

	public SalePerson(String name, String address, int age, boolean gender, Float salary, float commission) {
		super(name, address, age, gender, salary);
		this.commission = commission;
	}

	public float getCommission() {
		return commission;
	}

	public void setCommission(float commission) {
		this.commission = commission;
	}

	@Override
	public String toString() {
		return "SalePerson [commission=" + commission + ", name=" + name + ", address=" + address + ", age=" + age
				+ ", gender=" + gender + ", salary=" + salary + "]";
	}
	
}
