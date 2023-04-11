import org.cdac.delhi.ConsoleInput;

public class ConvertUpperCase {
public static void main(String[] args) {
	System.out.print("Enter the String : ");
	String str = ConsoleInput.getString();
	System.out.println("New String : "+ str.toUpperCase());
}
}
