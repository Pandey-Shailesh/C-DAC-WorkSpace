package org.fi.program;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Question002 {
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
			System.out.println("Enter the element want to add on first position: ");
			String element = scr.next();
			arrayList.add(0, element);

			Iterator<String> iterator = arrayList.iterator();
			while (iterator.hasNext()) {
				String name = iterator.next();
				System.out.println(name);
			}

		}

	}
}
