import org.cdac.delhi.ConsoleInput;
import org.in.cdac.Square;

public class RectangleAndSquareProblem {
public static void main(String[] args) {
	
	Square objSquare =new Square();
	System.out.println("ENTER LENGTH OF RECTANGLE:");
	objSquare.length=ConsoleInput.getDouble();
	System.out.println("ENTER BREATH OF RECTANGLE:");
	objSquare.breath=ConsoleInput.getDouble();
	System.out.println("ENTER SIDE OF SQUARE:");
	objSquare.side=ConsoleInput.getDouble();
	
	System.out.println("Area of rectangle is :"+objSquare.area(objSquare.length,objSquare.breath));
	System.out.println("Perimeter of rectangle is :"+objSquare.perimeter(objSquare.length,objSquare.breath));
	System.out.println("Area of square is :"+objSquare.area(objSquare.side));
	System.out.println("Perimeter of square is :"+objSquare.perimeter(objSquare.side));
}
}
