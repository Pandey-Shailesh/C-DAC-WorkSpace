

public class Student {
public Student(String name,int roll_no,String phone_no,String address) {
	String nameOfStudent=name;
	int roll_noOfStudent=roll_no;
	String phone_noOfStudent=phone_no;
	String addressOfStudent=address;
	System.out.println("Name =>"+nameOfStudent
			             +" Roll no.=> "+roll_noOfStudent
			             +" Phone number=> "+phone_noOfStudent
			             +" Address => "+addressOfStudent);
}
public static void main(String[] args) {
	
	System.out.println("Enter name :");
	String name = ConsoleInput.getString();
	System.out.println("Enter roll_no :");
	int roll_no = ConsoleInput.getInteger();
	System.out.println("Enter phone_no :");
	String phone_no = ConsoleInput.getString();
	System.out.println("Enter address :");
	String address = ConsoleInput.getString();
	
	new Student(name,roll_no,phone_no,address);
	
	
	
}
}
