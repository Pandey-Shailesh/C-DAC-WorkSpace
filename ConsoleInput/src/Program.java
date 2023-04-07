

public class Program{
	
	public static void statements() {
		System.out.println("Enter your Choice :");
		System.out.println("1) Addition of Two Integer");
		System.out.println("2) Addition of Two Float");
		System.out.println("3) Substraction of Two Integer");
		System.out.println("4) Substraction of Two Float");
		System.out.println("5) Multiplication of Two Integer");
		System.out.println("6) Division of Two Integer");
		System.out.println("7) Exit");
		}
	
	
public static void main(String[] args) {
	statements();
	
	Calculator objCalculator = new Calculator();
	int input = ConsoleInput.getInteger();
	while(input<7) {
		
		
		switch(input)
		{
		case 1: 
			 System.out.println("Enter the First Integer Number."); 
			 	int num1 = ConsoleInput.getInteger();
			 	System.out.println("Enter the Second Integer Number."); 
			 	int num2 = ConsoleInput.getInteger();
			 	System.out.println("The sum of  two numbers is "+objCalculator.addition(num1,num2));
			 	break;
		case 2: 
			 System.out.println("Enter the First Integer Number."); 
			 	float num3 = ConsoleInput.getFloat();
			 	System.out.println("Enter the Second Integer Number."); 
			 	float num4 = ConsoleInput.getFloat();
			 	System.out.println("The sum of  two numbers is "+objCalculator.addition(num3,num4));
			 	break;
		case 3: 
			 	System.out.println("Enter the First Integer Number."); 
			  	int num5 = ConsoleInput.getInteger();
			 	System.out.println("Enter the Second Integer Number."); 
			 	int num6 = ConsoleInput.getInteger();
			 	System.out.println("The sum of  two numbers is "+objCalculator.substraction(num5,num6));
			 	break;
		case 4: 
			 System.out.println("Enter the First Integer Number."); 
			 	float num7 = ConsoleInput.getFloat();
			 	System.out.println("Enter the Second Integer Number."); 
			 	float num8 = ConsoleInput.getFloat();
			 	System.out.println("The sum of  two numbers is "+objCalculator.substraction(num7,num8));
			 	break;
		case 5: 
				System.out.println("Enter the First Integer Number."); 
				int num9 = ConsoleInput.getInteger();
			 	System.out.println("Enter the Second Integer Number."); 
			 	int num10 = ConsoleInput.getInteger();
			 	System.out.println("The sum of  two numbers is "+objCalculator.multipication(num9,num10));
			 	break;
		case 6: 
				System.out.println("Enter the First Integer Number."); 
				int num11 = ConsoleInput.getInteger();
			 	System.out.println("Enter the Second Integer Number."); 
			 	int num12 = ConsoleInput.getInteger();
			 	System.out.println("The sum of  two numbers is "+objCalculator.division(num11,num12));
			 	break;
		case 7: 
			    System.out.println("Exit...."); 
			 	break;
			 	
		default:
			System.out.println("thank you");
		}
		statements();
		input = ConsoleInput.getInteger();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//==============================
//	char sign='+';
//	switch(sign){
//		case '+':
//			 System.out.println("Enter the First Number."); 
//		 	long num1 = getLong();
//		 	System.out.println("Enter the Second Number."); 
//		 	long num2 = getLong();
//		 	System.out.println("The sum of  two numbers is "+(num1+num2));
//		 	break;
//		
//	}
	//============================
	
//	System.out.println("Enter the First Number.");
//	double num1 = getDouble();
//	System.out.println("Enter the Second Number.");
//	double num2 = getDouble();
//	System.out.println("The sum of  two numbers is "+(num1+num2));
	
	//======================

//	System.out.println("Enter the First Number.");
//	int num1 = getInteger();
//	System.out.println("Enter the Second Number.");
//	int num2 = getInteger();
//	System.out.println("The sum of  two numbers is "+(num1+num2));
	
	//======================
	
//	 System.out.println("Enter the First Number."); 
//	 long num1 = getLong();
//	 System.out.println("Enter the Second Number."); 
//	 long num2 = getLong();
//	 System.out.println("The sum of  two numbers is "+(num1+num2));


	//======================

//	System.out.println("Enter the First Number.");
//	float num1 = getShort();
//	System.out.println("Enter the Second Number.");
//	float num2 = getShort();
//	System.out.println("The sum of  two numbers is "+(num1+num2));
	
	
	//======================

//	System.out.println("Enter the First String.");
//	String name1 = getString();
//	System.out.println("Enter the Second Number.");
//	String name2 = getString();
//	System.out.println("The Name is "+name1+" "+name2);
		
}

}
