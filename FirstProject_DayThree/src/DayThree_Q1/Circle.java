package DayThree_Q1;

import gettingInputs.ConsoleInput;

public class Circle {
public static void main(String[] args) {
	System.out.println("Enter the Radius of Circle :");
	double input = ConsoleInput.getDouble();
	FunctionalityOfCircle objFunct = new FunctionalityOfCircle();
	System.out.println("The Area of circle is "+ objFunct.area(input));
	System.out.println("The Perimeter of circle is "+ objFunct.perimeter(input));
}
}
