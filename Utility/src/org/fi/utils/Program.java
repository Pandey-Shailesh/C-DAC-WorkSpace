package org.fi.utils;

import org.cdac.delhi.ConsoleInput;

public class Program {
	public static void main(String[] args) {
		LinkedList<String> objList = new LinkedList<>();

		
		//LinkedList<Integer> secobjList = new LinkedList<>();
		objList.add("first");
		objList.add("second");
		objList.add("third");
		objList.add("fourth");
		objList.add("fifth");
		objList.add("sixth");
		
		//objList.delete(0);

//	String data =(String)objList.getFirst();
//		while (data!=null) {
//			System.out.println(data);
//			data=(String)objList.getNext();
//		}
//	

		int choice = -1;
		do {
			System.out.println("Enter the choice");
			choice = ConsoleInput.getInteger();
			switch (choice) {
			case 1: {
				String data = (String) objList.getFirst();
				System.out.println(data);
			}
				break;
			case 2: {
				String data = (String) objList.getNext();
				System.out.println(data);
			}
				break;
			case 3: {
				String data = (String) objList.getPrevious();
				System.out.println(data);
			}
				break;
			case 4: {
				String data = (String) objList.getLast();
				System.out.println(data);
			}
				break;

			}
		} while (choice != 5);

	}
}
