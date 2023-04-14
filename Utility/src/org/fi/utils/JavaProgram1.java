package org.fi.utils;

import org.cdac.delhi.ConsoleInput;

public class JavaProgram1 {

	public static void main(String[] args) {

		LinkedList<Integer> objList = new LinkedList<>();
		objList.add(1);
		objList.add(2);
		objList.add(3);
		objList.add(4);
		objList.add(5);
		objList.add(6);
		objList.add(7);
		objList.add(8);
		objList.add(9);
		objList.add(10);

		/*
		 * // Boxing and Unboxing int value=11; objList.add(value); Object obj =
		 * objList.getFirst(); System.out.println(obj);
		 * 
		 * //Autoboxing
		 * 
		 * Integer ObjInteger =value; //boxing
		 * 
		 * int data = objInteger; // unboxing
		 */

		System.out.println("a. Display all the numbers");
		System.out.println("b. Display the Highest Number");
		System.out.println("c. Display the Lowest Number");
		System.out.println("d. Display the Total Sum of all the numbers");
		System.out.println("e. Display the average of all the numbers");
		System.out.println("f. Display the number of times this number has been repeated");
		System.out.println("g. Display the index position of that number");
		char val = ConsoleInput.getCharacter();
		switch (val) {
		case 'a': {
			Integer data = (Integer) objList.getFirst();
			System.out.println("the display  all numbers ");
			while (data != null) {
				System.out.println(data);
				data = (Integer) objList.getNext();
			}
			break;
		}

		case 'b': {
			Integer data = (Integer) objList.getFirst();
			Integer data2 = (Integer) objList.getFirst();
			while (data != null) {
				if (data < data2) {
					System.out.println("data 2");
					data2 = (Integer) objList.getFirst();
				} else {

				}

			}
			break;
		}
		case 'c': {

			break;
		}
		case 'd': {
			int sum = 0;
			Integer data = (Integer) objList.getFirst();
			System.out.println("the sum of all numbers ");
			while (data != null) {
				sum = sum + data;
				data = (Integer) objList.getNext();
			}
			System.out.println("the sum is :" + sum);
			break;
		}
		case 'e': {
			int sum = 0;
			Integer data = (Integer) objList.getFirst();
			System.out.println("the sum of all numbers ");
			while (data != null) {
				sum = sum + data;
				data = (Integer) objList.getNext();
			}
			int avg = sum / 10;
			System.out.println("the avg is :" + avg);
			break;
		}
		case 'f': {
			System.out.println("Enter the number you want to find: ");
			int num = ConsoleInput.getInteger();
			int count = 0;
			Integer data = (Integer) objList.getFirst();
			while (data != null) {
				if (data == num)
					count++;
				data = (Integer) objList.getNext();
			}
			System.out.println("The number of times " + num + " persent in Linkedlist is " + count);
			break;
		}

		case 'g': {
			System.out.println("Enter the number you want to find: ");
			int num = ConsoleInput.getInteger();
			int count = 0;
			Integer data = (Integer) objList.getFirst();
			while (data != null) {
				if (data == num)
					System.out.println(count);
				count++;
				data = (Integer) objList.getNext();
			}
			System.out.println("The number of times " + num + " persent in Linkedlist at position  " + count);
			break;
		}

		}

	}
}
