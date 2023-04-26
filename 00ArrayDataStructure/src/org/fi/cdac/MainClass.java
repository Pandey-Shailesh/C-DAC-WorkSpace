package org.fi.cdac;

public class MainClass {
public static void main(String[] args) {
	SingleDimensionalArray sa = new SingleDimensionalArray(5);
	System.out.println("Elements of an array1:  ");
	sa.visitArrayElements();
	
	System.out.println(" ");
	sa.insertElement(0, 10);
	sa.insertElement(1, 20);
	sa.insertElement(0, 30);
	
	sa.visitArrayElements();
}
}
