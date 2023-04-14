package org.fi.cabService;

public class CabService {
	String car_type;
	double km;
	double bill;
	public CabService() {
		car_type=" ";
		km=0.0;
		bill=0.0;
	}

public void accept(double kilometer) {
	if(car_type.equalsIgnoreCase("AC")) {
		this.car_type="AC";
	this.km=kilometer;
	this.bill = 150+(kilometer-5)*10;
	}
	else if (car_type.equalsIgnoreCase("Non-AC")){
		this.car_type="Non-AC";
		this.km=kilometer;
		this.bill = 120+(kilometer-5)*8;
	}
}



	public String getCar_type() {
		
		return car_type;
	}
	
	public double getKm() {
		
		return km;
	}
	public double getBill() {
		
		return bill;
	}
	
	
	
	
	
	
	
	
	
	
	
}
