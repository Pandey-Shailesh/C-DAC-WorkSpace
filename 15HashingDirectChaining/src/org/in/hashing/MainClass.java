package org.in.hashing;

public class MainClass {

	public static void main(String[] args) {
		DirectChaining objDirectChaining =new DirectChaining(5);
		objDirectChaining.insertHashTable("Shailesh");
		objDirectChaining.insertHashTable("Vaibhav");
		objDirectChaining.insertHashTable("Vinu");
		objDirectChaining.insertHashTable("Abhi");
		objDirectChaining.insertHashTable("Sid");
		objDirectChaining.insertHashTable("Sonu");
		
		objDirectChaining.displayHashTable();
		objDirectChaining.searchValue("Abhi");
		
		objDirectChaining.deleteKey("Shailesh");
		objDirectChaining.displayHashTable();
	}
}
