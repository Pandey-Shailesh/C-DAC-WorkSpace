package org.in.hashing;

public class MainClass {

	public static void main(String[] args) {
		
		LinearProbing objLinearProbing = new LinearProbing(3); 
		objLinearProbing.insertDataInHashTable("Shailesh");
		objLinearProbing.insertDataInHashTable("Abhi");
		objLinearProbing.insertDataInHashTable("Vinu");
		objLinearProbing.insertDataInHashTable("Vaibhav");
		
		objLinearProbing.displayHashTable();
		
		
		
		objLinearProbing.searchValue("Vinu");
		System.out.println("======================");
		objLinearProbing.deleteData("Shailesh");
		System.out.println("======================");
		objLinearProbing.displayHashTable();
		
		
	}
}
