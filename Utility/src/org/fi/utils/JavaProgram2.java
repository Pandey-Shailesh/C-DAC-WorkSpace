package org.fi.utils;

import java.util.Iterator;

import org.cdac.delhi.ConsoleInput;

public class JavaProgram2 {
public static void main(String[] args) {
	//LinkedList<String> secobjList = new LinkedList<>();

	
	LinkedList<Integer> objList = new LinkedList<>();

	System.out.println("enter the number you want to add in linkedlist");
	for (int iTemp = 0; iTemp < 10; iTemp++) {
		int num=ConsoleInput.getInteger();
		objList.add(num);
	}
	//shorting:
	for (int jTemp = 0; jTemp < 10; jTemp++) {
		
	}
	
	
}
}
