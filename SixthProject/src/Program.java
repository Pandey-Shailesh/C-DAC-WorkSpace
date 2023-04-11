import org.cdac.delhi.ConsoleInput;
import org.in.inheritance.Member;

public class Program {
public static void main(String[] args) {
	Member objMember =new Member();
	System.out.println("Enter Name :");
	objMember.name=ConsoleInput.getString();
	System.out.println("Enter age :");
	objMember.age=ConsoleInput.getInteger();
	System.out.println("Enter phone_no :");
	objMember.phone_no=ConsoleInput.getString();
	System.out.println("Enter address :");
	objMember.address=ConsoleInput.getString();
	System.out.println("Enter salary :");
	objMember.salary=ConsoleInput.getFloat();
	
	
	
	System.out.println(objMember.name);
	System.out.println(objMember.age);
	System.out.println(objMember.phone_no);
	System.out.println(objMember.address);
	System.out.println(objMember.salary);
	
	
}
	
}
