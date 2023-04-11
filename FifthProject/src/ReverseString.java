import org.cdac.delhi.ConsoleInput;

public class ReverseString {
public static void main(String[] args) {
	System.out.print("Enter the String : ");
	String strOne = ConsoleInput.getString();
	
	int length = strOne.length(); // length of String
    String reversedString ="";
    char character;

    for(int iTemp=0;iTemp<length;iTemp++){
        character= strOne.charAt(iTemp);
        reversedString = character+reversedString;
    }
    System.out.println("Reversed string is : "+reversedString);


	
}
}
