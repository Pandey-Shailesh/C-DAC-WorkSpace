package org.fi.cdac;

public class SingleDimensionalArray {
	int array1[] = null;

	public SingleDimensionalArray(int sizeOfArray) {
		array1 = new int[sizeOfArray];
		for (int i = 0; i < array1.length; i++) {
			array1[i] = Integer.MIN_VALUE;
		}
	}

	// creating a method to display all the elements of an array
	public void visitArrayElements() {
		try {
			for (int i = 0; i < array1.length; i++) { // --------------- O(n)
				System.out.print(array1[i] + "   ");  // ---------------O(1)
			}
		} catch (Exception ex) {
			System.out.println("Array does not exists  "); // ----------O(1)
		}
	}
	
	// insert value inside an array
	public void insertElement(int location, int Value) {
		try {
			if(array1[location] == Integer.MIN_VALUE) {  // -----------O(1)
				array1[location] = Value;  // -----------(1)
				System.out.println("Value inserted Successfully ");  // -----------O(1)
			}
			else {
				System.out.println("This location is not empty"); //-----------O(1)
			}
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Invalid index provided "); //-----------O(1)	
		}
	}
	
	// delete value from an array
		public void deleteElement( int indexValue) {
			try {
				array1[indexValue]=Integer.MIN_VALUE;
			}
			catch(ArrayIndexOutOfBoundsException ex) {
				System.out.println("Value is not available "); 	
			}
		}
	
		// Search value from an array
				public void searchElement( int searchedValue) {
					try {
						for (int temp = 0; temp < array1.length; temp++) {
							if (array1[temp]==searchedValue) {
								System.out.println("value found at the position of"+temp);
							break;
							} 
						}
					}
					catch(ArrayIndexOutOfBoundsException ex) {
						System.out.println("Value is not available "); 	
					}
				}
	
	
}
