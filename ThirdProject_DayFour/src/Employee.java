
public class Employee {
	int num1, num2, num3;// global variables

	public Employee(int side1, int side2, int side3)// parametersied constructors
	{
		num1 = side1;
		num2 = side2;
		num3 = side3;
	}

	public static void main(String[] args) {

		Employee temp = new Employee(3, 4, 5);
		int peri = (temp.num1 + temp.num2 + temp.num3);
		System.out.println("perimeter is: " + peri);
		int sp = (peri / 2);
		double area = Math.sqrt(sp * (sp - temp.num1) * (sp - temp.num2) * (sp - temp.num3)); // squarerootof(s*(s-a)*(s-b)*(s-c))
		System.out.println("Area is: " + area);
	}
}
