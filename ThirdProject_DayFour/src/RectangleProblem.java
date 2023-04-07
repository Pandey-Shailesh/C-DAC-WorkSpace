

public class RectangleProblem {

public  double area(double length,double breath) {
	double area = length*breath;
	System.out.println("Area of Rectangle is :" +area);
	return area;
}
public static void main(String[] args) {
	RectangleProblem objFirst =new RectangleProblem();
	System.out.println("Enter the length of Rectangle :");
	double length = ConsoleInput.getDouble();
	System.out.println("Enter the breath of Rectangle :");
	double breath = ConsoleInput.getDouble();
	objFirst.area(length,breath);
	
	RectangleProblem objSecond =new RectangleProblem();
	System.out.println("Enter the length of Rectangle :");
	double length2 = ConsoleInput.getDouble();
	System.out.println("Enter the breath of Rectangle :");
	double breath2 = ConsoleInput.getDouble();
	objSecond.area(length2, breath2);
	
}
}
