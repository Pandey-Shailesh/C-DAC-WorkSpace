package DayThree_Q2;

import gettingInputs.ConsoleInput;

public class AcceptNumbers {
public static void main(String[] args) {
	System.out.println("Enter the number of Integers Values you wish to add :");

	int input = ConsoleInput.getInteger();
	int num =1;
	int sum =0;
	while(num<=input) {
		System.out.println("Enter the "+num+" value");
		int value = ConsoleInput.getInteger();
	    sum = sum+value;
	    num++;
	}
	System.out.println("Total of the above values is: "+sum);
}
}
