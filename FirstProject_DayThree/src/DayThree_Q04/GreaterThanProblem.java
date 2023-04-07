package DayThree_Q04;

import gettingInputs.ConsoleInput;

public class GreaterThanProblem {
public static void main(String[] args) {
	System.out.println("Enter the First Number ");
	int num1 = ConsoleInput.getInteger();
	System.out.println("Enter the Second Number ");
	int num2 = ConsoleInput.getInteger();
	System.out.println("Enter the Third Number ");
	int num3 = ConsoleInput.getInteger();
	if(num1<num2) {
		if(num2<num3) {
			System.out.println("The Result Is True");
		}
		else {
			System.out.println("Second Number is greater than Third Number");
		}	
	}
	else {
		System.out.println("Number First is greater than Second Number");
	}
	
	
}
}
