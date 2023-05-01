package org.fi.exam;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
	   private static void addCategory() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter Category Details:");
	        System.out.print("Category ID: ");
	        int catId = scanner.nextInt();
	        scanner.nextLine(); // consume newline
	        System.out.print("Category Name: ");
	        String categoryName = scanner.nextLine();
	        System.out.print("Category Description: ");
	        String categoryDesc = scanner.nextLine();
	        System.out.print("Category Image URL: ");
	        String categoryImageUrl = scanner.nextLine();
	        Category category = new Category(catId, categoryName, categoryDesc, categoryImageUrl);
	        if (!categories.contains(category)) {
	            categories.add(category);
	            System.out.println("Category added successfully.");
	        } else {
	            System.out.println("Category already exists.");
	        }
	    }
public static void main(String[] args) {
	int choice;
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
				 case 1:
	                    addCategory();
	                    break;
	                case 2:
	                    listCategories();
	                    break;
	                case 3:
	                    listCategoriesStartingWithE();
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
	} 
}


