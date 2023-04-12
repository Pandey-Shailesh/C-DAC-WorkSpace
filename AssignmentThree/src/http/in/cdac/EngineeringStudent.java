package http.in.cdac;

public class EngineeringStudent extends Student {
	

	protected String electiveOne;
	protected String electiveTwo;
	
	 
	public EngineeringStudent(String name, String address, boolean gender,String date, String electiveOne, String electiveTwo) {
		super(name, address, gender,date);
		this.electiveOne = electiveOne;
		this.electiveTwo = electiveTwo;
	}
	
	public String getElectiveOne() {
		return electiveOne;
	}
	public void setElectiveOne(String electiveOne) {
		this.electiveOne = electiveOne;
	}
	public String getElectiveTwo() {
		return electiveTwo;
	}
	public void setElectiveTwo(String electiveTwo) {
		this.electiveTwo = electiveTwo;
	}
	 
	 
	 

}
