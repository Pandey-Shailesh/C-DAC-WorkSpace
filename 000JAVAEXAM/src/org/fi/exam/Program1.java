package org.fi.exam;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program1 {
	
	public static void main(String[] args) {
		int choice;
		try {
			Set<Category> objSet = new HashSet<>();
			try (Scanner scr = new Scanner(System.in)) {
				do {

					System.out.println("===========Welcome===========");
					System.out.println("1) Add Collection Object");
					System.out.println("2) Display Collection Object");
					System.out.println("3) Display Collection Object start with E");
					System.out.println("4) Exit");
					System.out.println("=============================");
					System.out.print("Enter your choice : ");
					choice = scr.nextInt();

					switch (choice) {
					case 1:// Add
						System.out.print("Enter catId: ");
				        int catId = scr.nextInt();
				        System.out.print("Enter categoryName: ");
				        String categoryName =scr.next();
				        System.out.print("Enter categoryDesc: ");
				        String categoryDesc =scr.next();
				        System.out.print("Enter categoryImageUrl: ");
				        String categoryImageUrl =scr.next();
				        
				        Category objCat = new Category(catId,categoryName,categoryDesc,categoryImageUrl);
				        objCat.setCategoryDesc(categoryDesc);
				        objCat.setCategoryImageUrl(categoryImageUrl);
				        objCat.setCategoryName(categoryName);
				        objCat.setCatId(catId);
				        
				        objSet = (Set<Category>) objCat;
						break;

					case 2:// Display all
						System.out.println();
							
						
						
						
						
						break;

					case 3:// Display start with E
						
						
						break;

					case 4:// Exit
						System.out.println("Exiting the program...");
						break;

					default:
						System.out.println("Plese enter the valid input");
						break;
					}

				} while (choice < 4);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
