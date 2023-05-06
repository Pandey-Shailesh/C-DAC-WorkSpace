package org.in.hashing;

import java.util.ArrayList;

public class LinearProbing {

	String[] hashTable;
	int usedCellNumber;

	public LinearProbing(int size) {
		hashTable = new String[size];
		usedCellNumber = 0;
	}

	// magic Function()
	public int modASCIIHashFunction(String word, int M) {
		char ch[];
		ch = word.toCharArray();
		int i, sum;
		for (sum = 0, i = 0; i < word.length(); i++) {
			sum = sum + ch[i];
		}
		return sum % M;
	}

	// load Factor
	public double loadFactor() {
		double loadFactor = usedCellNumber * 1.0 / hashTable.length; // According to JAVA doucmentation
		return loadFactor;
	}

	// Re-hash Table Creation
	public void rehashTable(String word) {
		usedCellNumber = 0;
		ArrayList<String> data = new ArrayList<String>();
		for (String str : hashTable) {
			if (str != null) {
				data.add(str);
			}
		}
		data.add(word);
		hashTable = new String[hashTable.length * 2];
		for (String str : data) {
			// insert data in hash table
			insertDataInHashTable(str);
		}
	}

	// insert Data In Hash Table
	public void insertDataInHashTable(String word) {
		double loadFactor = loadFactor();
		if (loadFactor >= 0.75) {
			rehashTable(word);
		} else {
			int index = modASCIIHashFunction(word, hashTable.length);
			for (int iTemp = index; iTemp < index + hashTable.length; iTemp++) {
				int newIndex = iTemp % hashTable.length;
				if (hashTable[newIndex] == null) {
					hashTable[newIndex] = word;
					System.out.println("The " + word + " added at the location " + newIndex);
					break;
				} else {
					System.out.println(
							newIndex + " position is already occupied. So inserting in the next index position.");

				}
			}
		}
		usedCellNumber++;
	}

	// Display the value of Hash Table
	public void displayHashTable() {
		if (hashTable == null) {
			System.out.println("Hash Table is empty.");
			return;
		} else {
			System.out.println("The Hash table items is ");
			for (int iTemp = 0; iTemp < hashTable.length; iTemp++) {
				System.out.println("Index:- " + iTemp + " ; Key:- " + hashTable[iTemp]);
			}
		}
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////

	// Searching the item in hashTable
	public boolean searchValue(String word) {
		int index = modASCIIHashFunction(word, hashTable.length);
		if (hashTable[index] != null && hashTable[index].equals(word)) {
			System.err.println(word + " found at the location " + index);
			return true;
		} else {
			System.err.println(word + " not found ");
			return false;
		}
	}
////////////////////////////////////////////////////////////////////////////////////
	// delete () method
	public void deleteData(String word) {

		int index = modASCIIHashFunction(word, hashTable.length);
		for (int iTemp = index; iTemp < index + hashTable.length; iTemp++) {
			int newIndex = iTemp % hashTable.length;
			if (hashTable[newIndex] != null && hashTable[newIndex].equals(word)) {
				hashTable[newIndex] = null;
				System.out.println("The " + word + " deleted from the location " + newIndex);
				return;
			} else {
				System.out
						.println(newIndex + " not found to delete.");

			}
		}
	}

//	???????Sir code 
//	// searchData()
//			public void searchData(String word) {
//				int index = modASCIIHashFunction(word, hashTable.length);
//				for (int i = index; i < index + hashTable.length; i++) {
//					int newIndex = i % hashTable.length;
//					if (hashTable[newIndex] != null && hashTable[newIndex].equals(word)) {
//						System.out.println("The " + word + " found at the location " + newIndex);
//						return;
//					} else {
//						System.out.println(word + "not found ");
//					}
//
//				}
//			}
//
//		// deleteData()
//		public void deleteData(String word) {
//			int index = modASCIIHashFunction(word, hashTable.length);
//			for (int i = index; i < index + hashTable.length; i++) {
//				int newIndex = i % hashTable.length;
//				if (hashTable[newIndex] != null && hashTable[newIndex].equals(word)) {
//					hashTable[newIndex] = null;
//					System.out.println("The " + word + "has been deleted");
//					return;
//				} else {
//					System.out.println(word + "not found to delete");
//				}
//
//			}
//		}
}
