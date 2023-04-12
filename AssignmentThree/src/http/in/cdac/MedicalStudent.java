package http.in.cdac;

public class MedicalStudent extends Student {
	
	protected String specialization;
	
	public MedicalStudent(String name, String address, boolean gender,String date, String specialization) {
		super(name, address, gender,date);
		this.specialization = specialization;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	 
	 

}
