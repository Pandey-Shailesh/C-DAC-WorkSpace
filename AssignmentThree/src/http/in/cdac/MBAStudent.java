package http.in.cdac;

public class MBAStudent extends Student {
	 
	protected int yrOfExp;
	 protected String graduationDetails;
	 
	 
	public MBAStudent(String name, String address, boolean gender,String date, int yrOfExp, String graduationDetails) {
		super(name, address, gender,date);
		this.yrOfExp = yrOfExp;
		this.graduationDetails = graduationDetails;
	}
	public int getYrOfExp() {
		return yrOfExp;
	}
	public void setYrOfExp(int yrOfExp) {
		this.yrOfExp = yrOfExp;
	}
	public String getGraduationDetails() {
		return graduationDetails;
	}
	public void setGraduationDetails(String graduationDetails) {
		this.graduationDetails = graduationDetails;
	}

	 
	 
	 
	 
}
