package org.fi.program;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Question004 {
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
			System.out.println("Enter the element");
			String element = scr.next();
			
			System.out.println("Enter the element you want to update:");
			String elementToUpdate = scr.next();
			
			Iterator<String> iterator = arrayList.iterator();
			while (iterator.hasNext()) {
				String name = iterator.next();
				if (name.equals(elementToUpdate)) {
					iterator.remove();
					arrayList.add(element);
					System.out.println(name);
				}
			}
		
			
			
			
			
			}

		}
	}

