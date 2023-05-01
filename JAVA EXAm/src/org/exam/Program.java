package org.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	static Scanner scr = new Scanner(System.in);
	private static final List<Category> category = new ArrayList<>();
	
	public static void main(String[] args) 
	{
		int choice=0;
		do
		{
			System.out.println("===========Welcome===========");
			System.out.println("1) Add Collection Object");
			System.out.println("2) Display Collection Object");
			System.out.println("3) Display Collection Object start with E");
			System.out.println("4) Exit");
			System.out.println("=============================");
			System.out.print("Enter your choice : ");
			
			System.out.println("Enter your choice: ");
			choice = scr.nextInt();
			
			switch(choice)
			{
				case 1://ADD
					addCategory();
					break;
				case 2://LIST
					listCategory();
					break;
				case 3://START WITH E
					categoryStartWithE();
				case 4:// Exit
					System.out.println("Exiting the program...");
					break;

				default:
					System.out.println("Plese enter the valid input");
					break;
			}
		}
		while(choice< 4);
	}


	//get the information to add 
	private static void addCategory() 
	{
		System.out.println("Enter category id: ");
		int catId = scr.nextInt();
		
		System.out.println("Enter category name: ");
		String categoryName = scr.next();
		
		System.out.println("Enter category description: ");
		String categoryDesc = scr.next();
		
		System.out.println("Enter category image url: ");
		String categoryImageUrl = scr.next();
		
		Category objCategory = new Category(catId,categoryName,categoryDesc,categoryImageUrl);
		
		if(category.contains(objCategory))
		{
			System.out.println("Category already exists.");
		}
		else
		{
			category.add(objCategory);
            System.out.println("Category added successfully.");
		}
	}
	
	//list category
	private static void listCategory() 
	{
		if(category.isEmpty())
		{
			System.out.println("Category list is empty");
		}
		else
		{
			System.out.println("List of category: ");
			for(Category objCategory : category)
			{
				System.out.println(objCategory.getCatId());
				System.out.println(objCategory.getCategoryName());
				System.out.println(objCategory.getCategoryDesc());
				System.out.println(objCategory.getCategoryImageUrl());
				
			}
		}
	}
	
	//displays categories whose name starts with ‘E’
	
	private static void categoryStartWithE() 
	{
		System.out.println("Category Name Start with E");
		category.stream().filter(category -> category.getCategoryName()
				.startsWith("E")).forEach(category -> System.out.println(category.getCategoryName()));
	}
}
