import org.cdac.delhi.ConsoleInput;

public class GetCharacterAtIndex {
	public static void main(String[] args) {
		System.out.println("Enter the String :");
		String str = ConsoleInput.getString();
		
		while(true) {
	    System.out.println("Enter the position: ");
		int num = ConsoleInput.getInteger();
		str.charAt(num);
		System.out.println("The character at position "+num+" is "+str.charAt(num));
		}
		
		
	}
}
