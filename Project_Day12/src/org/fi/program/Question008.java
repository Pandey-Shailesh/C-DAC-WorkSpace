package org.fi.program;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Question008 {
public static void main(String[] args) {
	try (Scanner scr = new Scanner(System.in)) {
		String data = null;
		ArrayList<String> arrayList = new ArrayList<>();
		while (true) {
			System.out.println("ENter the elements: ");
			data = scr.next();

			if (data.equals("exit")) {
				break;
			}
			arrayList.add(data);
		}
		ArrayList<String> arrayList2= (ArrayList<String>) arrayList.clone();
	     System.out.println(arrayList2);
	
	}
}
}
