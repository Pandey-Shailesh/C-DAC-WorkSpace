package org.fi.program;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Question001 {
	public static void main(String[] args) {

		try (Scanner scr = new Scanner(System.in)) {
			String data = null;
			ArrayList<String> arrayList = new ArrayList<>();
			while (true) {
				System.out.println("ENter the Colors: ");
				data = scr.next();

				if (data.equals("exit")) {
					break;
				}
				arrayList.add(data);
			}
			Iterator<String> iterator = arrayList.iterator();
			while (iterator.hasNext()) {
				String colors = iterator.next();
				System.out.println(colors);
			}

		}

	}

}
