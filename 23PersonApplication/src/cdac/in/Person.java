package cdac.in;

public class Person {

	public String firstName;
	public String lastName;
	public int age;

	// create reference of array
	public Person[] personArray;
	public int nElems;

	// constructor
	public Person(int max) {
		personArray = new Person[max]; // create personArray
		nElems = 0;
	}

	public Person(String firstName, String lastName, int age) {
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

	public String getLast() // get last name
	{
		return firstName;
	}

	public void insert(String firstName, String lastName, int age) {
		try {
			personArray[nElems] = new Person(firstName, lastName, age);
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
	}

	public void insertionSort() {
		int in, out;
		for (out = 1; out < nElems; out++) // out is dividing line
		{
			Person temp = personArray[out]; // remove marked person
			in = out; // start shifting at out
			while (in > 0 && personArray[in - 1].getLast().compareTo(temp.getLast()) > 0) {
				personArray[in] = personArray[in - 1]; // shift item to the right
				--in; // go left one position
			}
			personArray[in] = temp; // insert marked item
		} // end for
	} // end insertionSort()

}
