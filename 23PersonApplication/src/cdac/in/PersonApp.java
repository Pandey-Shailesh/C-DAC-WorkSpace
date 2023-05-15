package cdac.in;

import java.util.*;

public class PersonApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Person Array:  ");
		int maxSize = sc.nextInt();
		Person person = new Person(maxSize);
		
		person.insert("Evans", "Patty", 24);
		person.insert("Smith", "Doc", 59);
		person.insert("Smith", "Lorraine", 37);
		person.insert("Smith", "Paul", 37);
		person.insert("Yee", "Tom", 43);
		person.insert("Hashimoto", "Sato", 21);
		person.insert("Stimson", "Henry", 29);
		person.insert("Velasquez", "Jose", 72);
		person.insert("Vang", "Minh", 22);
		person.insert("Creswell", "Lucinda", 18);
		System.out.println("Before sorting:");
		person.display(); // display items
		person.insertionSort(); // insertion-sort them
		System.out.println("After sorting:");
		person.display();
		sc.close();
	}

}
