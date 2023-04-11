import org.cdac.delhi.ConsoleInput;

public class ReplaceWords {
public static void main(String[] args) {
	System.out.println("Enter the String :");
	String strOne = ConsoleInput.getString();
	System.out.println("Enter Word you want to replace :");
	String strTwo = ConsoleInput.getString();
	System.out.println("Enter Word you want to replace with :");
	String strThree = ConsoleInput.getString();
     strOne = strOne.replaceAll(strThree, strTwo);
    System.out.println(strOne);
}
}
