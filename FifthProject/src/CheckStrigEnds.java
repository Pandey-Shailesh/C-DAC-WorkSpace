import org.cdac.delhi.ConsoleInput;

public class CheckStrigEnds {
public static void main(String[] args) {
	while(true) {
	System.out.println("Enter the frist String :");
	String strOne = ConsoleInput.getString();
	
	System.out.println("Enter the Second String :");
	String strTwo = ConsoleInput.getString();
	System.out.println(strOne+" ends with "+strTwo+" ? "+strOne.endsWith(strTwo));
	}
}
}
