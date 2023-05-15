//Name:- Shailesh Buddthinath Pandey
//PRN:-  230310120029

package cdac.in;

import java.util.Scanner;

public class Question2 {
	public String firstName;
	public String lastName;
	public int age;

	// create reference of array
	public Question2[] personArray;
	public int nElems;

	// constructor
	public Question2(int max) {
		personArray = new Question2[max]; // create personArray
		nElems = 0;
	}

	public Question2(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	// displayPerson() details method
	public void displayPerson() {
		System.out.print(" First name: " + firstName);
		System.out.print(", Last name: " + lastName);
		System.out.println(", Age: " + age);
	}

	public int getAge() // get Age
	{
		return age;
	}

	public void insert(String firstName, String lastName, int age) {
		try {
			personArray[nElems] = new Question2(firstName, lastName, age);
			nElems++; // increment size
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Maximum size is insufficient, to store all the person details");
		}

	}

	public void display() // displays array contents
	{
		for (int j = 0; j < nElems; j++) // for each element,
			personArray[j].displayPerson(); // display it
		System.out.println("");
	}// O(n)-->time complexity and space complexity is O(1)

	public void bubbleSort() {
		try {
			int length = personArray.length;
			for (int iTemp = 0; iTemp < length - 1; iTemp++) {
				for (int jTemp = 0; jTemp < length - iTemp - 1; jTemp++) {
					if (personArray[jTemp].age > personArray[jTemp + 1].age) {
						Question2 temp = personArray[jTemp];
						personArray[jTemp] = personArray[jTemp + 1];
						personArray[jTemp + 1] = temp;
						jTemp++;
					}
				}
			}
		} catch (NullPointerException e) {
			System.out.println("Please fill all the details \n");
		}
	}// O(n^2)-->time complexity and space complexity is O(1)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Person Array:  ");
		int maxSize = sc.nextInt();
		Question2 person = new Question2(maxSize);

		person.insert("Andy", "Luke", 35);
		person.insert("Lucy", "Wins", 32);
		person.insert("Michael", "Von", 45);
		person.insert("James", "Anderson", 37);
		person.insert("Kate", "Winslet", 52);

		System.out.println("Before sorting:");
		person.display(); // display items
		person.bubbleSort(); // bubble-sort them
		System.out.println("After sorting:");
		person.display();
		sc.close();
	}

}
