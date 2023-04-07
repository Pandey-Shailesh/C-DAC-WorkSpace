
public class TriangleProblem {
	double sideOne;
	double sideTwo;
	double SideThree;
public TriangleProblem(double valOne,double ValTwo, double valThree){
	 sideOne=valOne;
	 sideTwo=ValTwo;
	 SideThree=valThree;
}
public double area() {
	double amount=(sideOne + sideTwo + SideThree)/2;
	double area= Math.sqrt(amount*(amount-sideOne)*(amount-sideTwo)*(amount-SideThree));
	return area;
}
public double parameter() {
	double parameter = (sideOne + sideTwo + SideThree);
	return parameter;
}

public static void main(String[] args) {
	System.out.println("Enter the First Side:");
	double num1 = ConsoleInput.getDouble();
	System.out.println("Enter the Second Side:");
	double num2 = ConsoleInput.getDouble();
	System.out.println("Enter the Third Side:");
	double num3 = ConsoleInput.getDouble();
	
	TriangleProblem obj =new TriangleProblem(num1,num2,num3);
	System.err.println("Area: "+obj.area());
	System.out.println("Parameter: "+obj.parameter());
}
}
