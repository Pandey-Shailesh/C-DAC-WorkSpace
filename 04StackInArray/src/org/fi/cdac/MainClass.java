package org.fi.cdac;

public class MainClass {
public static void main(String[] args) {
	
	StackInArray objOfStackInArray = new StackInArray(12);
	
	objOfStackInArray.push(20);
	objOfStackInArray.push(50);
	objOfStackInArray.push(60);
	objOfStackInArray.push(40);
	objOfStackInArray.push(80);
	objOfStackInArray.push(90);
	
	objOfStackInArray.printStackData();
	System.out.println("---------------");
	objOfStackInArray.pop();
	objOfStackInArray.printStackData();
	System.out.println("---------------");
	objOfStackInArray.peek();
	objOfStackInArray.printStackData();
	objOfStackInArray.deleteStack();
	objOfStackInArray.printStackData();
}
}
