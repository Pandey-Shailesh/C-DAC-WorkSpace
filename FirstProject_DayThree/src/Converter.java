

public class Converter {	
	public static void main(String[] args) {
		System.out.println("Enter the Seconds.");
		int n = ConsoleInput.getInteger();
		int sec = (n%60);
		int min = (n/60)%60;
		int hr = n/(60*60);
		
		System.out.println(hr+":"+min+":"+sec);
	}
}
