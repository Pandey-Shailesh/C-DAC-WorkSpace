
public class DateFirst {
	
	//class variable/ static variable 
	static int count;
	//static block / static initialization block
	static
	{
	System.out.println("Static block fired");	
	}
	
	
	
/**
 * Initialization 1: initialization at the point 
 */
	public int day=1;
	public int month=4;
	public int year=2023;
/*
 * Initialization 2: initialization block 
 */
	{
		day=9;
		if(day==2)
			day=8;
		else
			day=10;
		 month=8;
		 year=2053;
		 System.out.println("first initilization block");
	}
	
/*
 * Initialization 3: initialization with Constructors
 * A constructors is a special member function of the class that has the same name as that of 
 * the class, has no return type and will be automatically invoke each time an object of this class 
 * is created.
*/	
	//no-arg, zero-arg / default constructors
	
	public DateFirst() {
		System.out.println("constructor invoke");
		day =18;
	}
	
	
	//instance member function
	
	public void display() {
		System.out.println(day+"/"+month+"/"+year);
	//	System.out.printf("%d/%d/%d",day,month,year);  ==> both are similar
	
		
	}
	
	public void display(int imp) {
		System.out.println("instance member function invoke");
	}
	
	
	
	//Static member function
	public static void show()
	{
		System.out.println("Static member function invoke");
	}

}
