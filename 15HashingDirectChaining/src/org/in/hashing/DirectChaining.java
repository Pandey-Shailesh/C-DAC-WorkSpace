package org.in.hashing;
import java.util.LinkedList;

public class DirectChaining {
	LinkedList<String>[] hashTable; 
	int maxChainSize=5;
	
	public DirectChaining(int size) {
		hashTable = new LinkedList[size];
		
	}
	//magic Function()
	public int modASCIIHashFunction(String word, int M) {
		char ch[];
		ch = word.toCharArray();
		int i,sum;
		for (sum = 0,i=0; i < word.length(); i++) {
			sum=sum+ch[i];
		}
		return sum % M;
	}
	
	//insert Method
	public void insertHashTable(String word) {
		int newIndex = modASCIIHashFunction(word, hashTable.length);
		if (hashTable[newIndex]==null) {
			hashTable[newIndex] = new LinkedList<String>();
			hashTable[newIndex].add(word);
		} else {
			hashTable[newIndex].add(word);
		}
	}
	
	//Display the value of Hash Table
	public void displayHashTable() {
		if (hashTable == null) {
			System.out.println("Hash Table is empty.");
			return;
		}
		else {
			System.out.println("The Hash table items is ");
			for (int iTemp = 0; iTemp < hashTable.length; iTemp++) {
				System.out.println("Index "+iTemp+" ; Key "+ hashTable[iTemp]);
			}
		}
	}
	
	//Searching the item in hashTable
	public boolean searchValue(String word) {
		int newIndex = modASCIIHashFunction(word, hashTable.length);
		if (hashTable[newIndex]!=null && hashTable[newIndex].contains(word)) {
			System.err.println(word+" found at the location "+ newIndex);
			return true;
		}
		else {
			System.err.println(word+" not found ");
			return false;
		}
	}
	
	//delete () method
	public void deleteKey(String word) {
		int newIndex = modASCIIHashFunction(word, hashTable.length);
		boolean result = searchValue(word);
		if (result == true) {
			hashTable[newIndex].remove(word);
			System.out.println(word+" is deleted form hash table");
		}
		else {
			System.out.println("value is bole found");
		}
		}
	
	
}
