package org.fi.program;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Question007 {
public static void main(String[] args) {
	try(Scanner scr = new Scanner(System.in)){
	String data = null;
	TreeSet<String> treeSet = new TreeSet<>();
	
	while(true) {
		
		System.out.println("Enter the value");
		data = scr.next();
		
		if (data.equals("exit")) {
			break;
		}
		treeSet.add(data);
	}
	Iterator<String> iterator = treeSet.iterator();
	while (iterator.hasNext()) {
		String name = iterator.next();
		System.out.println(name);
	}
}
}
}
