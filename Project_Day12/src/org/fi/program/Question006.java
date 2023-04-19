package org.fi.program;

import java.util.ArrayList;
import java.util.Scanner;

public class Question006 {
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
			System.out.println("Enter the element you want to search: ");
			String element =scr.next();
			System.out.println("element is present: "+arrayList.contains(element));
		

		}
	}
}
